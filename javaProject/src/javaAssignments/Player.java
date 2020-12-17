package javaAssignments;

public class Player extends Person{

	private double rating;
	private Team team;

	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public double getRating() {
		return rating;
	}
	public Team getTeam() {
		return team;
	}
	
	
	
}
