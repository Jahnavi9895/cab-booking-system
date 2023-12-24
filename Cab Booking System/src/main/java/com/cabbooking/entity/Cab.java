package com.cabbooking.entity;

import com.cabbooking.util.CabType;

public class Cab {
	private Integer cabId;
	private CabType cabType;
	private Driver driver;
	private Double ratePerKm;
	private String registrationNo;
	private Boolean cabAvailability;
	private String currentLocation;
}