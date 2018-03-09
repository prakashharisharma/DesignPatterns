package com.td.dp.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Icecream icecream = new SimpleIcecream();
		
		System.out.println(icecream.makeIcecream());
		Icecream nutsIcecream = new NutsIcecream(new SimpleIcecream());
		System.out.println(nutsIcecream.makeIcecream());
		
		Icecream honeyIcecream = new HoneyIcecream(new SimpleIcecream());
		
		System.out.println(honeyIcecream.makeIcecream());
		
		Icecream nutsHoneyIcecream = new NutsIcecream(new HoneyIcecream(new SimpleIcecream()));
		
		System.out.println(nutsHoneyIcecream.makeIcecream());
	}
}
