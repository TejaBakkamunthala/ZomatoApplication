package com.zomato.app.Entity;
	
	
	import javax.persistence.*;

	@Entity
	@Table(name = "Country",schema="zomato")
	public class Country {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "country_id")
	    private int countryId;

	    @Column(name = "country_name", nullable = false)
	    private String countryName;

		public int getCountryId() {
			return countryId;
		}

		public void setCountryId(int countryId) {
			this.countryId = countryId;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		
		
		public Country(int countryId, String countryName) {
			super();
			this.countryId = countryId;
			this.countryName = countryName;
		}
 
		public Country() {
			super();
		}

		@Override
		public String toString() {
			return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
		}

	 
	    
	    
	}

	

