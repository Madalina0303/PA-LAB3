package com.company;

import java.time.LocalTime;

public class Museum extends Location implements Visitable, Payable {
    private double ticketPrice;
    private LocalTime open;
    private LocalTime close;

    public Museum() {
        ticketPrice = 0;
        open = LocalTime.of(8, 0);
        close = LocalTime.of(20, 0);
    }

    public Museum(double ticketPrice, LocalTime open, LocalTime close) {
        this.ticketPrice = ticketPrice;
        this.open = open;
        this.close = close;
    }

    @Override
    public LocalTime getClose() {
        return close;
    }

    @Override
    public LocalTime getOpen() {
        return open;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }


    public void setClose(LocalTime close) {
        this.close = close;
    }


    public void setOpen(LocalTime open) {
        this.open = open;
    }


    public void setTicketPrice(double price) {
        this.ticketPrice = price;
    }
}
