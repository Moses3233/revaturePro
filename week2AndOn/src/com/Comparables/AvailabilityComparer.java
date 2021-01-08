package com.Comparables;

import java.util.Comparator;

public class AvailabilityComparer implements Comparator<Flights>{

	@Override
	public int compare(Flights o1, Flights o2) {
		Boolean b1=o1.isAvailability();
		Boolean b2=o2.isAvailability();
		return b2.compareTo(b1);
	}

}
