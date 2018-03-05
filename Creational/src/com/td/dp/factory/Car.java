package com.td.dp.factory;

public class Car implements Vehicle {

	@Override
	public String model() {
		
		return "Hyundai";
	}

	@Override
	public int gear() {
		// TODO Auto-generated method stub
		return 5;
	}

}
