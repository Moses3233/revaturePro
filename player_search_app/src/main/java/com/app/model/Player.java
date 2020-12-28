package com.app.model;

public class Player {
	
	private String Name;
	private int id;
	private String playedby;
	private int Rank;
	
	public Player() {
		
		
	}

	public Player(String Name, int id, String playedby, int Rank) {
		
		this.Name = Name;
		this.id = id;
		this.playedby = playedby;
		this.Rank = Rank;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayedby() {
		return playedby;
	}

	public void setPlayedby(String playedby) {
		this.playedby = playedby;
	}

	public int getRank() {
		return Rank;
	}

	public void setRank(int rank) {
		Rank = rank;
	}

	@Override
	public String toString() {
		
	return "Player [Name= " + Name +", ID= " + id + ", Played By= " + playedby + ", Rank= " + Rank + " ]";

	}




}
