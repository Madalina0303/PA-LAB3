package com.company;

import java.util.HashMap;
import java.util.Map;

public abstract class Location {
    private String name;
    private Map<Location, Integer> cost;
    public Location()
    {
        cost=new HashMap<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Location, Integer> getCost() {
        return cost;
    }

    public void setCost(Map<Location, Integer> cost) {
        this.cost = cost;
    }

    public void setCostLoc(Location dest, int val) {
        cost.put(dest, val);
    }
}
