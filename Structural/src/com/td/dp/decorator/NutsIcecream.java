package com.td.dp.decorator;

public class NutsIcecream extends IcecreamDecorator {

	NutsIcecream(Icecream specialIcecream) {
		super(specialIcecream);
	}

	@Override
	public String makeIcecream() {
		return specialIcecream.makeIcecream() + addNuts();
	}
	
	public String addNuts() {
		
		return " NUTS ADDED";
	}
}
