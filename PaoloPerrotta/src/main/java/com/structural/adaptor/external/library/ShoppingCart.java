package com.structural.adaptor.external.library;


import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items = new LinkedList<>();

	public void add(Item item) {
		items.add(item);
	}

	public boolean remove(Item item) {
		return items.remove(item);
	}

	public long getTotalPrice() {
		long result = 0;
		for (Item item: items) {
			result += item.itemPrice();
		}
		return result;
	}

	public String getReceipt() {
		StringBuffer result = new StringBuffer();
		for (Item item: items) { 
			result.append(item.itemName() + "\t" + formatMoney(item.itemPrice()) + "\n");
		}
		result.append("----------------------\n");
		result.append("Total:\t\t" + formatMoney(getTotalPrice()) + "\n");
		return result.toString();
	}

	private String formatMoney(long money) {
		return "€" + (money / 100) + "." + (money % 100);
	}
}
