package com.td.dp.adapter;

public class ACToDCPlugConnectorAdapter implements DCPlugConnector {

	private ACPlugConnector plug;
	
	ACToDCPlugConnectorAdapter(ACPlugConnector plug){
		this.plug = plug;
	}
	
	@Override
	public void provideElectricity() {
		plug.giveElectricity();
	}

}
