package com.structural.composite;

public class Main {

	public static void main(String[] args) {
		MultipleOrder firstOrder = new MultipleOrder();
        firstOrder.add(new ItemOrder("1234", "Baseball Cap", 2000));
        firstOrder.add(new ItemOrder("8888", "Party Hat", 3000));
        
//        System.out.println(firstOrder.getDescription());
//        System.out.println("Total: €" + firstOrder.getTotal());

        MultipleOrder secondOrder = new MultipleOrder();
        secondOrder.add(new ItemOrder("4321", "Beanie", 2000));
        secondOrder.add(new ItemOrder("3333", "Joker Hat", 3000));
        
//        System.out.println(secondOrder.getDescription());
//        System.out.println("Total: €" + secondOrder.getTotal());
        
//        MultipleOrder finalOrder = new MultipleOrder();
//        for (ItemOrder itemOrder : firstOrder.orders) {
//        	finalOrder.add(itemOrder);			
//		}
//        for (ItemOrder itemOrder : secondOrder.orders) {
//        	finalOrder.add(itemOrder);			
//		}
        
        MultipleOrder finalOrder = new MultipleOrder();
        finalOrder.add(firstOrder);
        finalOrder.add(secondOrder);
        
        
        System.out.println(finalOrder.getDescription());
        System.out.println("Total: €" + finalOrder.getTotal());
        
        
//        MultipleOrder order = new MultipleOrder();
//        order.add(firstOrder);
//        order.add(secondOrder);

//        System.out.println(firstOrder.getDescription());
//        System.out.println("\nTotal: €" + firstOrder.getTotal());

	}

}
