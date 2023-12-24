package com.cabbooking.entity;

import java.time.LocalDateTime;

import com.cabbooking.dto.CabDTO;
import com.cabbooking.util.RideStatus;

public class Ride {
	private Integer rideId;
	private Customer customer;
	private Cab cab;
	private String pickupLocation;
	private String dropoffLocation;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private RideStatus rideStatus;

}
