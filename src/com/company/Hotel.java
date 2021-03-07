package com.company;

public class Hotel extends Location implements Classifiable {
    private double rank;
    public Hotel()
    {
        this.rank=0;
    }
    public Hotel(double rank)
{
    this.rank=rank;
}

    @Override
    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }
}
