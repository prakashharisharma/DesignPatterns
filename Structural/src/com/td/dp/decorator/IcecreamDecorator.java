package com.td.dp.decorator;

public abstract class IcecreamDecorator implements Icecream {

	Icecream specialIcecream;
	
	IcecreamDecorator(Icecream specialIcecream){
		this.specialIcecream = specialIcecream;
	}
	
	@Override
	public String makeIcecream() {
		return specialIcecream.makeIcecream();
	}

}
