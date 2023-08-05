package com.pluralsight.creational.builder.latest;

import com.pluralsight.creational.builder.latest.enums.*;

public class ComputerTelescope {
	
	private HDD hddSize;
	private RAM ramSize;
	private Boolean hasUsb;
	private Boolean hasWifi;

	
	public ComputerTelescope(HDD hddSize) {
		this.hddSize = hddSize;
	}
	
	public ComputerTelescope(RAM ramSize) {
		this.ramSize = ramSize;
	}
	public ComputerTelescope(HDD hddSize, RAM ramSize) {
		this(hddSize);
		this.ramSize = ramSize;
	}

	public ComputerTelescope(HDD hddSize, RAM ramSize, Boolean hasUsb) {
		this(hddSize,ramSize);		
		this.hasUsb = hasUsb;
	}

	public ComputerTelescope(HDD hddSize, RAM ramSize, Boolean hasUsb, Boolean hasWifi) {
		this(hddSize,ramSize,hasUsb);
		this.hasWifi = hasWifi;
	}


	public HDD getHddSize() { return hddSize; }
	public RAM getRamSize() {return ramSize; }
	public Boolean getHasUsb() {return hasUsb;	}
	public Boolean getHasWifi() {	return hasWifi;	}
	
	
}
