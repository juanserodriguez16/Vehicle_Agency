package model;

import java.util.Comparator;

public class VehiclePlateSort implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o1.getPlaca().compareToIgnoreCase(o2.getPlaca());
	}

}
