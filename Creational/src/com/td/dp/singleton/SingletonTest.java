package com.td.dp.singleton;

public class SingletonTest {

	public static void main(String[] args) throws IllegalAccessException {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1.hashCode()==s2.hashCode());
		
		
	}
}
