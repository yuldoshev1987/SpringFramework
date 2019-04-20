package com.well.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Tesla implements Vehicle{

	public String startEngine() {
		
		return "Car engine started";
	}

	public String vinNumber() {
		
		return "Tesla2345ggd";
	}

	public String typeOfVehicle() {
		
		return "Sport";
	}

	public int numberOfSeat() {
		
		return 5;
	}

}
