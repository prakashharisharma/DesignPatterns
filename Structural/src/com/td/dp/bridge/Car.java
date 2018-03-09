package com.td.dp.bridge;

public class Car extends Vehicle {

	Car(Workshop workshop1, Workshop workshop2){
		super(workshop1, workshop2);
	}
	
	@Override
	public void manufacture() {
		System.out.println("Manufacturing CAR...");
		workshop1.work();
		workshop2.work();

	}

}
