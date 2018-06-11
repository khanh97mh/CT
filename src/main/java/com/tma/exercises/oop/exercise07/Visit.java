package com.tma.exercises.oop.exercise07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = new Date();
	}

	public Visit(String name, Date date) {
		customer = new Customer(name);
		this.date = date;
	}

	public String getName() {
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense += serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense += productExpense;
	}

	public double getTotalExpense() {
		if (!customer.isMember())
			return serviceExpense + productExpense;
		double service = serviceExpense * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()));
		double product = productExpense * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
		return service + product;
	}

	@Override
	public String toString() {
		SimpleDateFormat ft = new SimpleDateFormat("E dd/MM/yyyy");
		return "Visit [" + customer + ", date=" + ft.format(date) + ", serviceExpense=" + serviceExpense
				+ ", productExpense=" + productExpense + "]";
	}
}
