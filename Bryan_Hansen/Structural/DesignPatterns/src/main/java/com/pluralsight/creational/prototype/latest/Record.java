package com.pluralsight.creational.prototype.latest;

public class Record  implements Cloneable{
	@Override
	protected Record clone()  {		
		try {
			return (Record) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
