package com.tma.exercises.oop.exercise07;

public class DiscountRate {
	public static double serviceDiscaountPremium = 0.2;
	public static double serviceDiscaountGold = 0.15;
	public static double serviceDiscaountSilver = 0.1;
	public static double productDiscaountPremium = 0.1;
	public static double productDiscaountGold = 0.1;
	public static double productDiscaountSilver = 0.1;
	
	public static double getServiceDiscountRate(String type) {
		if(type.equals("Premium"))
			return serviceDiscaountPremium;
		else if(type.equals("Gold"))
			return serviceDiscaountGold;
		else if(type.equals("Silver"))
			return serviceDiscaountSilver;
		return 0;
	}
	public static double getProductDiscountRate(String type) {
		if(type.equals("Premium"))
			return productDiscaountPremium;
		else if(type.equals("Gold"))
			return productDiscaountGold;
		else if(type.equals("Silver"))
			return productDiscaountSilver;
		return 0;
	}
}
