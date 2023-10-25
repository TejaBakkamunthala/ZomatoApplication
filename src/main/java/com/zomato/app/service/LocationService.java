package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.Location;

public interface LocationService {
    List<Location> getAllLocations();
    Location getLocationById(int locationId);
    Location createLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(int locationId);
}
