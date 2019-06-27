package com.bpdts.rest.model;

public class User {
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User() {
		 
    }
 
    public User(Integer id, String firstName, String lastName, String email,
    		String ip, String city, Double latitude, Double longitude) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ip = ip;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }
  
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String ip;
    private Double latitude;
    private Double longitude;
    private String city;
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", "
        		+ "lastName=" + lastName + ", email=" + email + "]";
    }

}
