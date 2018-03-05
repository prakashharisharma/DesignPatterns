package com.td.dp.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
	
	private static volatile Singleton instance = null;

	private Singleton() throws IllegalAccessException {
		if(instance!=null) {
			throw new IllegalAccessException("NOT ALLOWED");
		}
	}

	public static Singleton getInstance() throws IllegalAccessException {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException();

	}

}
