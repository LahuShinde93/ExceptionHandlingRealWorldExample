package com.nit.User;

import com.nit.Implementation.CarUser;
import com.nit.customException.CarStopedException;
import com.nit.requirment.CarRequirments;

public class ClassTester {

	public static void main(String[] args) {

		CarRequirments c = new CarUser();
		try {
			c.CarStop("break");
		} catch (CarStopedException e) {
			System.out.println(e.getMessage());
		}

	}

}
