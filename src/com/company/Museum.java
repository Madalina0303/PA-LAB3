package com.company;

import java.time.LocalTime;

public class Museum extends Location implements Visitable, Payable {
    private double ticketPrice;
    private LocalTime open;
    private LocalTime close;

    @Override
    public LocalTime getClose() {
        return close;
    }

    @Override
    public LocalTime getOpen() {
        return open;
    }

    @Override
    public double getTicketprice() {
        return ticketPrice;
    }

    public void setClose(LocalTime close) {
        this.close = close;
    }

    public void setOpen(LocalTime open) {
        this.open = open;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
