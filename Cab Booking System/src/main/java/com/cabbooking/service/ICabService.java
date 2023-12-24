package com.cabbooking.service;

import java.util.List;

import com.cabbooking.dto.CabDTO;

public interface ICabService {
	public CabDTO addCab(CabDTO cab);

	public CabDTO updateCab(CabDTO cab);

	public List<CabDTO> viewCabs();

	public List<CabDTO> viewCabByType(String cabType);

	public List<CabDTO> viewCabByCurrentLocation(String currentLocation);
	
	public CabDTO viewCabByDriverId(int driverId);

	public CabDTO viewCabById(int cabId);

	public List<CabDTO> viewCabByTypeAndLocation(String cabType,String currentLocation);

	public List<CabDTO> viewCabByAvailability();
}