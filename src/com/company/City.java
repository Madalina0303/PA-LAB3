package com.company;

import java.util.ArrayList;
import java.util.List;

public class City {
    private List<Location> locations;
    private int nrLocation;
    public City(int nrLocation)
    {
        locations=new ArrayList<>(nrLocation);
        this.nrLocation=nrLocation;
    }
    public void addLocation(Location lct) {
        locations.add(lct);
    }

    public List<Location> getLocations() {
        return locations;
    }
}
