package com.td.dp.bridge;

//https://javapapers.com/design-patterns/bridge-design-pattern/
public class BridgeTest {

	public static void main(String[] args) {
		
		Vehicle car = new Car(new Produce(), new Assemble());
		car.manufacture();
		Vehicle bike = new Bike(new Produce(), new Assemble());
		bike.manufacture();
		
	}
	
}
