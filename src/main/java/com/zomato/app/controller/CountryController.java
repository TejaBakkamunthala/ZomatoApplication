package com.zomato.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.app.Entity.Country;
import com.zomato.app.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{countryId}")
    public Country getCountryById(@PathVariable int countryId) {
        return countryService.getCountryById(countryId);
    }

    @PostMapping
    public String createCountry(@RequestBody Country country) {
        countryService.createCountry(country);
        return "Successfully Inserted";
    }

    @PutMapping("/{countryId}")
    public String updateCountry(@PathVariable int countryId, @RequestBody Country country) {
        country.setCountryId(countryId);
        countryService.updateCountry(country);
        return "Successfully Updated";
    }

    @DeleteMapping("/{countryId}")
    public String deleteCountry(@PathVariable int countryId) {
        countryService.deleteCountry(countryId);
        return "Successfully Deleted";
    }
}
