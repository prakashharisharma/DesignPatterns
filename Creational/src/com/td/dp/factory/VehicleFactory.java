package com.td.dp.factory;

public class VehicleFactory {
	
	public static Vehicle getVehicle(VehicleType vehicleType) {
		
		switch(vehicleType) {
			case BIKE	:	return new Bike();
			case CAR	:	return new Car();
			case CYCLE	:	return new Cycle();
			default		:	throw new IllegalArgumentException("No such vehicle!!!");
		}
	}
}
