package com.company;

import java.util.ArrayList;

public class City {
    private ArrayList<Location> locations;
    private int nrLocation;
    public City(int nrLocation)
    {
        locations=new ArrayList<>(nrLocation);
        this.nrLocation=nrLocation;
    }
    public void addLocation(Location lct) {
        locations.add(lct);
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }
}
