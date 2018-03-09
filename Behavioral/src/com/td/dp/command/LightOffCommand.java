package com.td.dp.command;

public class LightOffCommand implements Command {

	 private Light myLight;
     public LightOffCommand ( Light L) {
             myLight  =  L;
     }
     
	@Override
	public void execute() {
		myLight.turnOff();

	}

}
