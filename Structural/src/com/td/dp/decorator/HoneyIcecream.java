package com.td.dp.decorator;

public class HoneyIcecream extends IcecreamDecorator {

	HoneyIcecream(Icecream specialIcecream) {
		super(specialIcecream);
	}

	@Override
	public String makeIcecream() {
		return specialIcecream.makeIcecream() + addHoney();
	}
	
	public String addHoney() {
		
		return " HONEY ADDED";
	}
}
