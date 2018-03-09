package com.td.dp.iterator;

public class IteratorPatternTest {
	public static void main(String[] args) {
		CollectionofNames cmpnyRepository = new CollectionofNames();

		for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
