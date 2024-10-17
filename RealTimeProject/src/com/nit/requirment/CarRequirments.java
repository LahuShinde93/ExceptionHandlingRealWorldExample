package com.nit.requirment;

import com.nit.customException.CarHeatException;
import com.nit.customException.CarPunctureException;
import com.nit.customException.CarStopedException;

public interface CarRequirments {

	public  void CarStop(String message) throws CarStopedException; 
 
	public void CarPuncture(String message)throws CarPunctureException;

	public void carHeat(int temp) throws CarHeatException;
}
