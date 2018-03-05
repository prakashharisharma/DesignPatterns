package com.td.dp.factory;

public class FactoryDemo {
	public static void main(String[] args) {
		Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.CYCLE);
		
		System.out.println(vehicle.model());
		System.out.println(vehicle.gear());
		
		vehicle = VehicleFactory.getVehicle(VehicleType.BIKE);
		
		System.out.println(vehicle.model());
		System.out.println(vehicle.gear());
		
		vehicle = VehicleFactory.getVehicle(VehicleType.CAR);
		
		System.out.println(vehicle.model());
		System.out.println(vehicle.gear());
		
	}
}
