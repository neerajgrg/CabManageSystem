package com.cms.model;

import com.cms.enums.CabStatus;

public class Cab  implements Comparable<Cab>{
	
	private int cabId;
	private String driverName;
	private CabStatus cabStatus;
	private long lastTripEndTimeinMillis;
	public long getLastTripEndTimeinMillis() {
		return lastTripEndTimeinMillis;
	}

	public void setLastTripEndTimeinMillis(long lastTripEndTimeinMillis) {
		this.lastTripEndTimeinMillis = lastTripEndTimeinMillis;
	}

	private City currentCity;

	public Cab(int cabId, String driverName, City city) {
		this.cabId = cabId;
		this.driverName = driverName;
		cabStatus = CabStatus.IDLE;
		this.currentCity = city;
	}

	public int getCabId() {
		return cabId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public boolean isAvalabile() {
		return this.cabStatus.equals(CabStatus.IDLE);
	}
	
	public void changeStatus(CabStatus carStatus) {
		this.cabStatus = carStatus;
	}
	
	public CabStatus getCurrentStatus() {
		return this.cabStatus;
	}

	public City getCurrentCity() {
		return this.currentCity;
	}
	
	
	public void setCurrentCity(City currentCity) {
		this.currentCity = currentCity;
	}

	@Override
	public int compareTo(Cab cab) {
		
		if(cab.cabStatus == this.cabStatus) 
			return cab.lastTripEndTimeinMillis >  this.lastTripEndTimeinMillis ? -1 :  1;
		
		if(cab.cabStatus == CabStatus.IDLE) return -1;
		
		return 1;
		
	}
	
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", driverName=" + driverName + ", carStatus=" + cabStatus + "]";
	}

}
