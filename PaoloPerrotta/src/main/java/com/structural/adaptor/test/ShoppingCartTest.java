package com.structural.adaptor.test;

import com.structural.adaptor.aardvarkhats.Hat;
import com.structural.adaptor.external.library.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		HatAdapter goldenHat = new HatAdapter(new Hat("Golden hat", "Golden hat", 4999));
		HatAdapter pointyHat = new HatAdapter(new Hat("Pointy hat", "Pointy hat", 3000));
		HatAdapter purpleHat = new HatAdapter(new Hat("Purple hat", "Purple hat", 1490));

		ShoppingCart cart = new ShoppingCart();
		
		cart.add(goldenHat);
		cart.add(pointyHat);
		cart.add(purpleHat);
		
		cart.remove(pointyHat);
		
		System.out.println(cart.getReceipt());
	}
}
