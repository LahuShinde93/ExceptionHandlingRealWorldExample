package com.nit.Implementation;

import com.nit.customException.CarHeatException;
import com.nit.customException.CarPunctureException;
import com.nit.customException.CarStopedException;
import com.nit.requirment.CarRequirments;

public class CarUser implements CarRequirments {

	public CarUser() {
		super();
	}

	@Override
	public void CarStop(String message) throws CarStopedException {

		if(message.equalsIgnoreCase("Break")) {
			throw new CarStopedException("Break Applied,Car Stoped..."); 
		}else {
			System.out.println("Car Running good enjoy the music..!");
		}
	}

	@Override
	public void CarPuncture(String message) throws CarPunctureException {
		if(message.equals(message)) {
			throw new CarPunctureException("Take car to garege tyre issue is there");
		}else {
			
			System.out.println("Car Running good enjoy the music..!");
		}
	}

	@Override
	public void carHeat(int temp) throws CarHeatException {

		if(temp>50) {
			throw new CarHeatException("Take a break buddy..! I nead some rest..");
		}
		else {
			System.out.println("Are you a Old person accelarate let's go Brummhhh...");
		}
	}

}
