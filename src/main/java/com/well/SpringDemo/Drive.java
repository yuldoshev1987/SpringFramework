package com.well.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Vehicle vh=context.getBean("tesla",Vehicle.class);
		System.out.println(vh.startEngine());
		System.out.println(vh.typeOfVehicle());
		System.out.println(vh.vinNumber());
		System.out.println(vh.numberOfSeat());
		
		
		
	}

}
