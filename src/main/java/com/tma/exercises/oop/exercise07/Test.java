package com.tma.exercises.oop.exercise07;

import java.sql.Date;

public class Test {
	public static void main(String[] args) {
		Customer customer = new Customer("Khanh");
		customer.setMember(true);
		customer.setMemberType("Gold");
		System.out.println(customer);
		Visit visit = new Visit(customer, null);	
		visit.setProductExpense(4.5);
		visit.setServiceExpense(8.5);
		visit.setProductExpense(1.5);
		System.out.println(visit);
		System.out.println("Total expense made by " + customer.getName() + " = " + visit.getTotalExpense());
	}
}
