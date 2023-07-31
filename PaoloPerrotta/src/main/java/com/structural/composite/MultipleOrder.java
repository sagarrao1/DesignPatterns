package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MultipleOrder implements IOrder{
//	List<ItemOrder> orders = new ArrayList<ItemOrder>();
	List<IOrder> orders = new ArrayList<IOrder>();
	
	@Override
	public String getDescription() {
		String desc = "";
		
		for (IOrder itemOrder : orders) {
			desc = desc + itemOrder.getDescription()+"\n";
		}		
		return desc;
	}
	
	@Override
	public int getTotal() {
			int tot=0;		
		for (IOrder itemOrder : orders) {
			tot= tot+itemOrder.getTotal();
		}
		return tot;		
	}
	
	public void add(IOrder order)
    {
        orders.add(order);
    }

	
}
