package com.zomato.app.Entity;


import javax.persistence.*;

@Entity
@Table(name = "city", schema="zomato")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int cityId;

    @Column(name = "city_pinCode")
    private int cityPinCode;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "state")
    private String state;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCityPinCode() {
		return cityPinCode;
	}

	public void setCityPinCode(int cityPinCode) {
		this.cityPinCode = cityPinCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public City(int cityId, int cityPinCode, String cityName, String state) {
		super();
		this.cityId = cityId;
		this.cityPinCode = cityPinCode;
		this.cityName = cityName;
		this.state = state;
	}

	
	public City() {
		super();
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityPinCode=" + cityPinCode + ", cityName=" + cityName + ", state=" + state
				+ "]";
	}

    
    
}
