package com.company;

public class Restaurant extends Location implements Classifiable {
    private double rank;

    @Override
    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

}