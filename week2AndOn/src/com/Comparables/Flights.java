package com.Comparables;

public class Flights implements Comparable<Flights> {

	private int id;
	private String name;
	private String manufactureName;
	private double cost;
	private float rating;
	private boolean availability;
	
	public Flights() {
		
	}
	
	public Flights(int id, String name, String manufactureName, double cost, float rating ,boolean availability) {
		this.setId(id);
		this.setName(name);
		this.setManufactureName(manufactureName);
		this.setCost(cost);
		this.setRating(rating);
		this.setAvailability(availability);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	@Override
	public String toString() {
		return "Flightt [id=" + id + ", name=" + name + ", Manufacturer Name=" + manufactureName +", cost=" + cost + ", ratings=" + rating + ", available="
				+ availability + "]";
	}

	@Override
	public int compareTo(Flights o) {
		Integer id1=this.id;
		Integer id2=o.id;
		
		return id1.compareTo(id2);
	}
	
	
}
