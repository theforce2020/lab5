package com.theforce;

import com.theforce.shop.Customer;
import com.theforce.shop.CustomerOrderFactory;
import com.theforce.shop.Order;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		// Create customer object
		Customer cust = CustomerOrderFactory.newCustomer("Bob");

		// Create first order
		Order order = CustomerOrderFactory.newOrder(cust, LocalDate.now());
		// add some items to first order
		CustomerOrderFactory.newOrderItem(order, "Shirt");
		CustomerOrderFactory.newOrderItem(order, "Laptop");

		// Create second order
		Order order2 = CustomerOrderFactory.newOrder(cust, LocalDate.now());

		// Add items to second order
		CustomerOrderFactory.newOrderItem(order2, "Pants");
		CustomerOrderFactory.newOrderItem(order2, "Knife set");

		// Test code
		assert (cust.getOrders().size() == 2);

		// count total orders
		long total = cust.getOrders().stream()
				.map(order1 -> order.getItems())
				.count();
		assert (total == 4);

		// print all orders
		System.out.println(cust.getOrders());

		System.out.println("All tests passed");
	}
}

		
