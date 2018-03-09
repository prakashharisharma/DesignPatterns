package com.td.dp.template;

public class TemplatePatternTest {

	public static void main(String[] args) {
		
		OrderProcessTemplate netOrder = new NetOrder();
		netOrder.processOrder();
		
		OrderProcessTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}
}
