package org.taxi.nyc;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class Application {

	public static final String ISO_8601_24H_FULL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
	final SimpleDateFormat sdf = new SimpleDateFormat(ISO_8601_24H_FULL_FORMAT);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Function<Flux<TaxiStatusUpdatePayload>, Flux<RideAveragePayload>> processDropoffRideAverages() {
		return flux -> flux.log().window(Duration.ofSeconds(20)).flatMap(this::calculateAverage);
	}

	private Mono<RideAveragePayload> calculateAverage(Flux<TaxiStatusUpdatePayload> flux) {
		// Aggregate the events in those windows
		return flux
				.reduce(new Accumulator(0, BigDecimal.ZERO, 0),
						(a, taxiUpdate) -> new Accumulator(a.getRideCount() + 1,
								a.getTotalMeter().add(taxiUpdate.getMeterReading()),
								a.getTotalPassengers() + taxiUpdate.getPassengerCount()))
				// Calculate the window average in RideAveragePayload objects
				.map(accumulator -> {
					if (accumulator.getRideCount() == 0) { 
						// Window was empty, return empty RideAveragePayload
						return new RideAveragePayload(BigDecimal.ZERO, 20, BigDecimal.ZERO, 0, sdf.format(new Date()));
					} else { 
						// Calculate averages based on window
						return new RideAveragePayload(
								(accumulator.getTotalMeter().divide(new BigDecimal(accumulator.getRideCount()))), 20,
								(new BigDecimal(accumulator.getTotalPassengers() / accumulator.getRideCount())),
								accumulator.getRideCount(), sdf.format(new Date()));
					}
				}).log();
	}

	// Using Lombok to generate getters, setters, constructors, etc.
	@Data
	@AllArgsConstructor
	static class Accumulator {
		private int rideCount;
		private BigDecimal totalMeter;
		private int totalPassengers;
	}

}