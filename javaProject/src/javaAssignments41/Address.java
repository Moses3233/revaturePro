package javaAssignments41;

public class Address {

	private int aid;
	private String streetName;
	private String cityName;
	private int zip;

	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public int getAid() {
		return aid;
	}
	public String getCityName() {
		return cityName;
	}
	public String getStreetName() {
		return streetName;
	}
	public int getZip() {
		return zip;
	}
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", streetName=" + streetName + ", city=" + cityName +  ", zip=" + zip + ", toString()="
				+ super.toString() + "]";
	}
	
}


