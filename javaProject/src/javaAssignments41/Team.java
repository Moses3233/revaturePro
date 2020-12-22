package javaAssignments41;

public class Team {

	private int teamId;
	private String teamName;
	private String coachName;
	
public Team(int teamId, String teamName, String coachName) {}

	
public void setTeamId(int teamId) {
	this.teamId = teamId;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public void setCoachName(String coachName) {
	this.coachName = coachName;
}

public int getTeamId() {
	return teamId;
}
public String getTeamName() {
	return teamName;
}
public String getCoachName() {
	return coachName;
}

public String toString() {
	return "Address [Team id=" + teamId + ", teamName=" + teamName + ", Coach Name=" + coachName + ", toString()="
			+ super.toString() + "]";
}

}
