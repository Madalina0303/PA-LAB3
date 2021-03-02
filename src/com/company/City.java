package com.company;

import java.util.ArrayList;

public class City {
    private ArrayList<Location> locations = new ArrayList<>();

    public void addLocation(Location lct) {
        locations.add(lct);
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }
}
