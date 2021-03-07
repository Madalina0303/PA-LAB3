package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {


        // create the locations
        Hotel v1 = new Hotel();
        Museum v2 = new Museum(10, LocalTime.of(7, 30), LocalTime.of(20, 0));
        Museum v3 = new Museum();
        Church v4 = new Church();
        Church v5 = new Church();
        Restaurant v6 = new Restaurant();

        //set cost for location

        v1.setCostLoc(v2, 10);
        v1.setCostLoc(v3, Integer.valueOf(50));
        v2.setCostLoc(v3, Integer.valueOf(20));
        v2.setCostLoc(v4, Integer.valueOf(20));
        v2.setCostLoc(v5, Integer.valueOf(10));
        v3.setCostLoc(v2, Integer.valueOf(20));
        v3.setCostLoc(v4, Integer.valueOf(20));
        v4.setCostLoc(v5, Integer.valueOf(30));
        v4.setCostLoc(v6, Integer.valueOf(10));
        v5.setCostLoc(v4, Integer.valueOf(30));
        v5.setCostLoc(v6, Integer.valueOf(20));

        City c = new City(6);
        // add locations to city
        c.addLocation(v1);
        c.addLocation(v2);
        c.addLocation(v3);
        c.addLocation(v4);
        c.addLocation(v5);
        c.addLocation(v6);


    }
}
