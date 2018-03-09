package com.td.dp.adapter;

public class AdapterPatternTest {

	public static void main(String[] args) {
		ACPlugConnector plugConnector = new PhillipsACPlugConnector();
		//DCElectricSocket dcSocket = new DCElectricSocket();
		DCPlugConnector dcPlug = new ACToDCPlugConnectorAdapter(plugConnector);
		
		dcPlug.provideElectricity();
	}
}
