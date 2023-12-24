package com.cabbooking.dto;

import com.cabbooking.util.CabType;

public class CabDTO {
	private Integer cabId;
	private CabType cabType;
	private DriverDTO driver;
	private Double ratePerKm;
	private String registrationNo;
	private Boolean cabAvailability;
	private String currentLocation;
}