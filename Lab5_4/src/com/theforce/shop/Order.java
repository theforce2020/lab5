package com.theforce.shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private LocalDate orderDate;
	private List<Item> items;

	//use a factory method
	Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
	}

	void addItem(String name){
		items.add(new Item(name));
	}

	public List<Item> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
