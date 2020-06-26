
package org.taxi.nyc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxiStatusUpdatePayload {

	public TaxiStatusUpdatePayload () {
	}
	public TaxiStatusUpdatePayload (
		String rideId, 
		Double latitude, 
		Double meterIncrement, 
		Integer passengerCount, 
		Integer pointIdx, 
		Double longitude, 
		String timestamp, 
		Double meterReading, 
		String rideStatus) {
		this.rideId = rideId;
		this.latitude = latitude;
		this.meterIncrement = meterIncrement;
		this.passengerCount = passengerCount;
		this.pointIdx = pointIdx;
		this.longitude = longitude;
		this.timestamp = timestamp;
		this.meterReading = meterReading;
		this.rideStatus = rideStatus;
	}


	@JsonProperty("ride_id")
	private String rideId;
	private Double latitude;
	@JsonProperty("meter_increment")
	private Double meterIncrement;
	@JsonProperty("passenger_count")
	private Integer passengerCount;
	@JsonProperty("point_idx")
	private Integer pointIdx;
	private Double longitude;
	private String timestamp;
	@JsonProperty("meter_reading")
	private Double meterReading;
	@JsonProperty("ride_status")
	private String rideStatus;

	public String getRideId() {
		return rideId;
	}

	public TaxiStatusUpdatePayload setRideId(String rideId) {
		this.rideId = rideId;
		return this;
	}


	public Double getLatitude() {
		return latitude;
	}

	public TaxiStatusUpdatePayload setLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}


	public Double getMeterIncrement() {
		return meterIncrement;
	}

	public TaxiStatusUpdatePayload setMeterIncrement(Double meterIncrement) {
		this.meterIncrement = meterIncrement;
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


	public Double getLongitude() {
		return longitude;
	}

	public TaxiStatusUpdatePayload setLongitude(Double longitude) {
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


	public Double getMeterReading() {
		return meterReading;
	}

	public TaxiStatusUpdatePayload setMeterReading(Double meterReading) {
		this.meterReading = meterReading;
		return this;
	}


	public String getRideStatus() {
		return rideStatus;
	}

	public TaxiStatusUpdatePayload setRideStatus(String rideStatus) {
		this.rideStatus = rideStatus;
		return this;
	}


	public String toString() {
		return "TaxiStatusUpdatePayload ["
		+ " rideId: " + rideId
		+ " latitude: " + latitude
		+ " meterIncrement: " + meterIncrement
		+ " passengerCount: " + passengerCount
		+ " pointIdx: " + pointIdx
		+ " longitude: " + longitude
		+ " timestamp: " + timestamp
		+ " meterReading: " + meterReading
		+ " rideStatus: " + rideStatus
		+ " ]";
	}
}

