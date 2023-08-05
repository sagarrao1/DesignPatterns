package com.pluralsight.creational.builder.latest;

import com.pluralsight.creational.builder.latest.enums.*;

public class Computer {

	public static class ComputerBuilder {
		private HDD hddSize;
		private RAM ramSize;
		private Boolean hasUsb;
		private Boolean hasWifi;
				
		public ComputerBuilder() {
		}

		public ComputerBuilder addHdd(HDD hddSize) {
			this.hddSize = hddSize;
			return this;
		}
		
		public ComputerBuilder addRam(RAM ramSize) {
			this.ramSize = ramSize;
			return this;
		}
		
		public ComputerBuilder addUsb(Boolean hasUsb) {
			this.hasUsb = hasUsb;
			return this;
		}
		
		public ComputerBuilder addWifi(Boolean hasWifi) {
			this.hasWifi = hasWifi;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
	}	
	
	private HDD hddSize;
	private RAM ramSize;
	private Boolean hasUsb;
	private Boolean hasWifi;
		
	public Computer(ComputerBuilder builder) {
		this.hddSize = builder.hddSize;
		this.ramSize = builder.ramSize;
		this.hasUsb = builder.hasUsb;
		this.hasWifi = builder.hasWifi;
		System.out.println("Computer constructor");
	}
	
	
	public HDD getHddSize() { return hddSize; }
	public RAM getRamSize() {return ramSize; }
	public Boolean getHasUsb() {return hasUsb;	}
	public Boolean getHasWifi() {	return hasWifi;	}
		
}
