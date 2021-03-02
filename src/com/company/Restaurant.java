package com.company;

public class Restaurant extends Location implements Classifiable, Payable {
    private double rank;
    private double price; // pretul se refera la meniul zilei

    @Override
    public double getTicketprice() {
        return price;
    }

    @Override
    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}