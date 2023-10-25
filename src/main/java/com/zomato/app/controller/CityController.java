package com.zomato.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zomato.app.Entity.City;
import com.zomato.app.Entity.User;
import com.zomato.app.common.Pagination;
import com.zomato.app.serviceimpl.CityServiceImpl;

@RestController
public class CityController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final CityServiceImpl cityService;

    @Autowired
    public CityController(CityServiceImpl cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public Page<City> getListOfCities(
            @RequestParam(value = "body", defaultValue = "{}") String body,
            @RequestParam(value = "pageNo", defaultValue = "0") int pageNo,
            @RequestParam(value = "recordPerPage", defaultValue = "100") int recordPerPage,
            @RequestParam(value = "sortKey", defaultValue = "cityId") String sortKey,
            @RequestParam(value = "sortDir", defaultValue = "asc") String sortDir
    ) throws JsonMappingException, JsonProcessingException {

        logger.info("Entering into getListOfCities method");

        ObjectMapper cityObjectMapper = new ObjectMapper();
        
        City searchedCityObjectInfo = cityObjectMapper.readValue(body, City.class);

        Pagination pagination = new Pagination(pageNo, recordPerPage, sortDir, sortKey);

        Page<City> cities = cityService.getListOfCities(searchedCityObjectInfo, pagination);

      		return cities;
    }

    @GetMapping("/cities/{cityId}")
    public City getCityById(@PathVariable int cityId) throws Exception {
        logger.info("Entering into getCityById method");
        return cityService.getCityById(cityId);
    }

    @PostMapping("/cities")
    public City saveCity(@RequestBody City city) {
        logger.info("Entering into saveCity method");
        return cityService.saveOrUpdateCity(city);
    }

    @DeleteMapping("/cities/{cityId}")
    public void deleteCity(@PathVariable int cityId) throws Exception {
        logger.info("Entering into deleteCity method");
        cityService.deleteCityById(cityId);
    }
}
