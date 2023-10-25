package com.zomato.app.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zomato.app.Entity.City;
import com.zomato.app.common.Pagination;
import com.zomato.app.repository.CityRepository;

@Service
@Transactional
public class CityServiceImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CityRepository cityRepository;

    public Page<City> getListOfCities(City searchedCityObjectInfo, Pagination pagination) {
        logger.info("Entering into getListOfCities method");
        Page<City> listOfCitiesToBeReturned = cityRepository.findAll(searchCriteriaForCity(searchedCityObjectInfo),
                pagination.getPageableInstance());
        return listOfCitiesToBeReturned;
    }

    public Specification<City> searchCriteriaForCity(City cityObject) {
        logger.info("Entering into searchCriteriaForCity method");
        return cityObject != null ? Specification.where(cityObject.getCityName() != null ? containsCityName(cityObject.getCityName()) : null)
                .and(cityObject.getCityId() > 0 ? containsCityId(cityObject.getCityId()) : null)
                .and(cityObject.getCityPinCode() > 0 ? containsCityPinCode(cityObject.getCityPinCode()) : null)
                .and(cityObject.getState() != null ? containsState(cityObject.getState()) : null) : null;
    }

    private Specification<City> containsCityName(String cityName) {
        return (city, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(city.get("cityName"), cityName);
    }

    private Specification<City> containsCityId(int cityId) {
        return (city, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(city.get("cityId"), cityId);
    }

    private Specification<City> containsCityPinCode(int cityPinCode) {
        return (city, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(city.get("cityPinCode"), cityPinCode);
    }

    private Specification<City> containsState(String state) {
        return (city, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(city.get("state"), state);
    }

    @Transactional
    public City saveOrUpdateCity(City city) {
        logger.info("Entering into saveOrUpdateCity method");
        return cityRepository.saveAndFlush(city);
    }

    public City getCityById(int cityId) throws Exception {
        logger.info("Entering into getCityById method");
        return cityRepository.findById(cityId)
                .orElseThrow(() -> new Exception("City for cityId = " + cityId + " not found"));
    }

    public void deleteCityById(int cityId) throws Exception {
        logger.info("Entering into deleteCityById method");

        if (!cityRepository.existsById(cityId)) {
            throw new Exception("City for cityId = " + cityId + " not found");
        }

        cityRepository.deleteById(cityId);
    }
}
