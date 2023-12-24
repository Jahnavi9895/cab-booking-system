package com.cabbooking.entity;

import java.time.LocalDateTime;

import com.cabbooking.util.BookingStatus;
import com.cabbooking.util.CabType;

public class TripBooking {
	private Integer tripBookingId;
	private Customer customer;
	private CabType cabType;
	private String pickupLocation;
	private String dropoffLocation;
	private LocalDateTime startDateTime;
	private BookingStatus bookingStatus;
	// Could be generated randomly
	private Double distanceInKm;
	private Double bill;
}