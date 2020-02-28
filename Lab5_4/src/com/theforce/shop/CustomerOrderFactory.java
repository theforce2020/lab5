package com.theforce.shop;

import java.time.LocalDate;

public class CustomerOrderFactory {
    public static Customer newCustomer(String name) {
        return new Customer(name);
    }

    public static Order newOrder(Customer customer, LocalDate date) {
        if(customer == null) throw new NullPointerException("Null customer");
        Order order = new Order(date);
        customer.addOrder(order);
        return order;
    }

    public static void newOrderItem(Order order, String name) {
        if(order == null) throw new NullPointerException("Null order");
        order.addItem(name);
    }
}
