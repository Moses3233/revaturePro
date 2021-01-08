package com.Comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class flightsMain {
	public static void main(String[] args) {

		List<Flights> FlightsList = new ArrayList<>();
		FlightsList.add(new Flights(100, "JAX","Spirit", 100.11, 2.2f, true));
		FlightsList.add(new Flights(200, "PAP", "Concord", 200.11, 4.7f, false));
		FlightsList.add(new Flights(101, "AUS", "American Airlines",190.11, 4.2f, false));
		FlightsList.add(new Flights(140, "FTL","JetBlue" ,190.11, 3.2f, true));
		FlightsList.add(new Flights(120, "NYC","American AirLines", 190.11, 4.7f, false));
		FlightsList.add(new Flights(199, "JPN","JetBlue", 200.11, 4.2f, true));
		FlightsList.add(new Flights(166, "LVX","Spirit", 140.11, 4.7f, true));
		FlightsList.add(new Flights(133, "SFX", "American Airlines", 110.11, 2.2f, true));

		System.out.println("Printing all the products");
		printProducts(FlightsList);

		Collections.sort(FlightsList); // uses Functional Interface Comparable using which it compares 2 objects
		System.out.println("\n\nPrinting all the products sorted by id");
		printProducts(FlightsList);

		Collections.sort(FlightsList, new AvailabilityComparer());
		System.out.println("\n\nPrinting all the products sorted by availability");
		printProducts(FlightsList);

		Collections.sort(FlightsList, (Flights p1, Flights p2) -> {
			Double d1 = p1.getCost();
			Double d2 = p2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\n\nPrinting all the products sorted by cost(low to high)");
		printProducts(FlightsList);

		Collections.sort(FlightsList, (Flights p1, Flights p2) -> {
			int x = 0;
			Float f1 = (float) p1.getRating();
			Float f2 = (float) p2.getRating();
			x = f2.compareTo(f1);
			if (x == 0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\n\nPrinting all the products sorted by ratings(high to low) and if 2 or more products have same rating then by cost(low to high)");
		printProducts(FlightsList);

	}

	public static void printProducts(List<Flights> FlightsList) {
		for (Flights p : FlightsList) {
			System.out.println(p);
		}
	}

}
