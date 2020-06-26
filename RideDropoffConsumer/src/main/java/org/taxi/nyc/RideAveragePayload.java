
package org.taxi.nyc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class RideAveragePayload {

	public RideAveragePayload () {
	}
	public RideAveragePayload (
		Double avgMeterReading, 
		Integer windowDurationSec, 
		Double avgPassengerCount, 
		Integer windowRideCount, 
		String timestamp) {
		this.avgMeterReading = avgMeterReading;
		this.windowDurationSec = windowDurationSec;
		this.avgPassengerCount = avgPassengerCount;
		this.windowRideCount = windowRideCount;
		this.timestamp = timestamp;
	}


	@JsonProperty("avg_meter_reading")
	private Double avgMeterReading;
	@JsonProperty("window_duration_sec")
	private Integer windowDurationSec;
	@JsonProperty("avg_passenger_count")
	private Double avgPassengerCount;
	@JsonProperty("window_ride_count")
	private Integer windowRideCount;
	private String timestamp;

	public Double getAvgMeterReading() {
		return avgMeterReading;
	}

	public RideAveragePayload setAvgMeterReading(Double avgMeterReading) {
		this.avgMeterReading = avgMeterReading;
		return this;
	}


	public Integer getWindowDurationSec() {
		return windowDurationSec;
	}

	public RideAveragePayload setWindowDurationSec(Integer windowDurationSec) {
		this.windowDurationSec = windowDurationSec;
		return this;
	}


	public Double getAvgPassengerCount() {
		return avgPassengerCount;
	}

	public RideAveragePayload setAvgPassengerCount(Double avgPassengerCount) {
		this.avgPassengerCount = avgPassengerCount;
		return this;
	}


	public Integer getWindowRideCount() {
		return windowRideCount;
	}

	public RideAveragePayload setWindowRideCount(Integer windowRideCount) {
		this.windowRideCount = windowRideCount;
		return this;
	}


	public String getTimestamp() {
		return timestamp;
	}

	public RideAveragePayload setTimestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}


	public String toString() {
		return "RideAveragePayload ["
		+ " avgMeterReading: " + avgMeterReading
		+ " windowDurationSec: " + windowDurationSec
		+ " avgPassengerCount: " + avgPassengerCount
		+ " windowRideCount: " + windowRideCount
		+ " timestamp: " + timestamp
		+ " ]";
	}
}

