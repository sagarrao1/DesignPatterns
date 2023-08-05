package com.pluralsight.creational.builder.latest;

import com.pluralsight.creational.builder.latest.enums.*;

public class ComputerBefore {
	
	private HDD hddSize;
	private RAM ramSize;
	private Boolean hasUsb;
	private Boolean hasWifi;
	
	public HDD getHddSize() { return hddSize; }
	public RAM getRamSize() {return ramSize; }
	public Boolean getHasUsb() {return hasUsb;	}
	public Boolean getHasWifi() {	return hasWifi;	}
	
	public void setHddSize(HDD hddSize) {this.hddSize = hddSize; }
	public void setRamSize(RAM ramSize) {this.ramSize = ramSize;	}
	public void setHasUsb(Boolean hasUsb) {	this.hasUsb = hasUsb;	}
	public void setHasWifi(Boolean hasWifi) {	this.hasWifi = hasWifi;	}
	
	
}
