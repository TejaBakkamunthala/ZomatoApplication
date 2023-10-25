package com.zomato.app.Entity;

import javax.persistence.*;

@Entity
@Table(name = "location",schema="zomato")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int locationId;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    private Country country;

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Location(int locationId, String address, City city, Country country) {
		super();
		this.locationId = locationId;
		this.address = address;
		this.city = city;
		this.country = country;
	}
	
	

	public Location() {
		super();
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", address=" + address + ", city=" + city + ", country=" + country
				+ "]";
	}

    
    
}
