package com.structural.adaptor.test;

import com.structural.adaptor.aardvarkhats.Hat;
import com.structural.adaptor.external.library.Item;

public class HatAdapter extends Item {

	private Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String itemName() {
		return hat.getShortName();
	}

	@Override
	public int itemPrice() {
		return hat.getPrice();
	}

}
