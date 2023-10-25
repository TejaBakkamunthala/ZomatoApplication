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

import com.zomato.app.Entity.Location;
import com.zomato.app.service.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/{locationId}")
    public Location getLocationById(@PathVariable int locationId) {
        return locationService.getLocationById(locationId);
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location) {
        return locationService.createLocation(location);
    }

    @PutMapping("/{locationId}")
    public Location updateLocation(@PathVariable int locationId, @RequestBody Location location) {
        location.setLocationId(locationId);
        return locationService.updateLocation(location);
    }

    @DeleteMapping("/{locationId}")
    public void deleteLocation(@PathVariable int locationId) {
        locationService.deleteLocation(locationId);
    }
}
