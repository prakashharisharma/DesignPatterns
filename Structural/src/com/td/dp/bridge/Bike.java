package com.td.dp.bridge;

public class Bike extends Vehicle {

	Bike(Workshop workshop1, Workshop workshop2){
		super(workshop1, workshop2);
	}
	
	@Override
	public void manufacture() {
		System.out.println("Manufacturing BIKE...");
		workshop1.work();
		workshop2.work();

	}

}
