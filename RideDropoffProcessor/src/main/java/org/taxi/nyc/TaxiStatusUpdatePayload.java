
package org.taxi.nyc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxiStatusUpdatePayload {

	public TaxiStatusUpdatePayload () {
	}
	public TaxiStatusUpdatePayload (
		String rideId, 
		Integer heading, 
		java.math.BigDecimal latitude, 
		Integer passengerCount, 
		Integer pointIdx, 
		String informationSource, 
		Integer speed, 
		Driver driver, 
		Passenger passenger, 
		java.math.BigDecimal meterIncrement, 
		java.math.BigDecimal longitude, 
		String timestamp, 
		java.math.BigDecimal meterReading, 
		RideStatus rideStatus) {
		this.rideId = rideId;
		this.heading = heading;
		this.latitude = latitude;
		this.passengerCount = passengerCount;
		this.pointIdx = pointIdx;
		this.informationSource = informationSource;
		this.speed = speed;
		this.driver = driver;
		this.passenger = passenger;
		this.meterIncrement = meterIncrement;
		this.longitude = longitude;
		this.timestamp = timestamp;
		this.meterReading = meterReading;
		this.rideStatus = rideStatus;
	}


	@JsonProperty("ride_id")
	private String rideId;
	private Integer heading;
	private java.math.BigDecimal latitude;
	@JsonProperty("passenger_count")
	private Integer passengerCount;
	@JsonProperty("point_idx")
	private Integer pointIdx;
	@JsonProperty("information_source")
	private String informationSource;
	private Integer speed;
	private Driver driver;
	private Passenger passenger;
	@JsonProperty("meter_increment")
	private java.math.BigDecimal meterIncrement;
	private java.math.BigDecimal longitude;
	private String timestamp;
	@JsonProperty("meter_reading")
	private java.math.BigDecimal meterReading;
	@JsonProperty("ride_status")
	private RideStatus rideStatus;

	public String getRideId() {
		return rideId;
	}

	public TaxiStatusUpdatePayload setRideId(String rideId) {
		this.rideId = rideId;
		return this;
	}


	public Integer getHeading() {
		return heading;
	}

	public TaxiStatusUpdatePayload setHeading(Integer heading) {
		this.heading = heading;
		return this;
	}


	public java.math.BigDecimal getLatitude() {
		return latitude;
	}

	public TaxiStatusUpdatePayload setLatitude(java.math.BigDecimal latitude) {
		this.latitude = latitude;
		return this;
	}


	public Integer getPassengerCount() {
		return passengerCount;
	}

	public TaxiStatusUpdatePayload setPassengerCount(Integer passengerCount) {
		this.passengerCount = passengerCount;
		return this;
	}


	public Integer getPointIdx() {
		return pointIdx;
	}

	public TaxiStatusUpdatePayload setPointIdx(Integer pointIdx) {
		this.pointIdx = pointIdx;
		return this;
	}


	public String getInformationSource() {
		return informationSource;
	}

	public TaxiStatusUpdatePayload setInformationSource(String informationSource) {
		this.informationSource = informationSource;
		return this;
	}


	public Integer getSpeed() {
		return speed;
	}

	public TaxiStatusUpdatePayload setSpeed(Integer speed) {
		this.speed = speed;
		return this;
	}


	public Driver getDriver() {
		return driver;
	}

	public TaxiStatusUpdatePayload setDriver(Driver driver) {
		this.driver = driver;
		return this;
	}


	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Driver {

		public Driver () {
		}
		public Driver (
			Integer driverId, 
			java.math.BigDecimal rating, 
			String lastName, 
			String carClass, 
			String firstName) {
			this.driverId = driverId;
			this.rating = rating;
			this.lastName = lastName;
			this.carClass = carClass;
			this.firstName = firstName;
		}


		@JsonProperty("driver_id")
		private Integer driverId;
		private java.math.BigDecimal rating;
		@JsonProperty("last_name")
		private String lastName;
		@JsonProperty("car_class")
		private String carClass;
		@JsonProperty("first_name")
		private String firstName;

		public Integer getDriverId() {
			return driverId;
		}

		public Driver setDriverId(Integer driverId) {
			this.driverId = driverId;
			return this;
		}


		public java.math.BigDecimal getRating() {
			return rating;
		}

		public Driver setRating(java.math.BigDecimal rating) {
			this.rating = rating;
			return this;
		}


		public String getLastName() {
			return lastName;
		}

		public Driver setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}


		public String getCarClass() {
			return carClass;
		}

		public Driver setCarClass(String carClass) {
			this.carClass = carClass;
			return this;
		}


		public String getFirstName() {
			return firstName;
		}

		public Driver setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}


		public String toString() {
			return "Driver ["
			+ " driverId: " + driverId
			+ " rating: " + rating
			+ " lastName: " + lastName
			+ " carClass: " + carClass
			+ " firstName: " + firstName
			+ " ]";
		}
	}



	public Passenger getPassenger() {
		return passenger;
	}

	public TaxiStatusUpdatePayload setPassenger(Passenger passenger) {
		this.passenger = passenger;
		return this;
	}


	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Passenger {

		public Passenger () {
		}
		public Passenger (
			Integer passengerId, 
			java.math.BigDecimal rating, 
			String lastName, 
			String firstName) {
			this.passengerId = passengerId;
			this.rating = rating;
			this.lastName = lastName;
			this.firstName = firstName;
		}


		@JsonProperty("passenger_id")
		private Integer passengerId;
		private java.math.BigDecimal rating;
		@JsonProperty("last_name")
		private String lastName;
		@JsonProperty("first_name")
		private String firstName;

		public Integer getPassengerId() {
			return passengerId;
		}

		public Passenger setPassengerId(Integer passengerId) {
			this.passengerId = passengerId;
			return this;
		}


		public java.math.BigDecimal getRating() {
			return rating;
		}

		public Passenger setRating(java.math.BigDecimal rating) {
			this.rating = rating;
			return this;
		}


		public String getLastName() {
			return lastName;
		}

		public Passenger setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}


		public String getFirstName() {
			return firstName;
		}

		public Passenger setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}


		public String toString() {
			return "Passenger ["
			+ " passengerId: " + passengerId
			+ " rating: " + rating
			+ " lastName: " + lastName
			+ " firstName: " + firstName
			+ " ]";
		}
	}



	public java.math.BigDecimal getMeterIncrement() {
		return meterIncrement;
	}

	public TaxiStatusUpdatePayload setMeterIncrement(java.math.BigDecimal meterIncrement) {
		this.meterIncrement = meterIncrement;
		return this;
	}


	public java.math.BigDecimal getLongitude() {
		return longitude;
	}

	public TaxiStatusUpdatePayload setLongitude(java.math.BigDecimal longitude) {
		this.longitude = longitude;
		return this;
	}


	public String getTimestamp() {
		return timestamp;
	}

	public TaxiStatusUpdatePayload setTimestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}


	public java.math.BigDecimal getMeterReading() {
		return meterReading;
	}

	public TaxiStatusUpdatePayload setMeterReading(java.math.BigDecimal meterReading) {
		this.meterReading = meterReading;
		return this;
	}


	public RideStatus getRideStatus() {
		return rideStatus;
	}

	public TaxiStatusUpdatePayload setRideStatus(RideStatus rideStatus) {
		this.rideStatus = rideStatus;
		return this;
	}


	public static enum RideStatus { accepted,pickup,enroute,dropoff }


	public String toString() {
		return "TaxiStatusUpdatePayload ["
		+ " rideId: " + rideId
		+ " heading: " + heading
		+ " latitude: " + latitude
		+ " passengerCount: " + passengerCount
		+ " pointIdx: " + pointIdx
		+ " informationSource: " + informationSource
		+ " speed: " + speed
		+ " driver: " + driver
		+ " passenger: " + passenger
		+ " meterIncrement: " + meterIncrement
		+ " longitude: " + longitude
		+ " timestamp: " + timestamp
		+ " meterReading: " + meterReading
		+ " rideStatus: " + rideStatus
		+ " ]";
	}
}

