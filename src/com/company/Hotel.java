package com.company;

public class Hotel extends Location implements Classifiable, Payable {
    private double rank;
    private double price; // pretul este pentru o noapte de cazare

    @Override
    public double getRank() {
        return rank;
    }

    @Override
    public double getTicketprice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }
}
