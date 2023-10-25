package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.Country;

public interface CountryService {
    List<Country> getAllCountries();
    Country getCountryById(int countryId);
    Country createCountry(Country country);
    Country updateCountry(Country country);
    void deleteCountry(int countryId);
}
