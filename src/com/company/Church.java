package com.company;

import java.time.LocalTime;

public class Church extends Location implements Visitable {

    private LocalTime open;
    private LocalTime close;

    public Church() {
        open = LocalTime.of(8, 0);
        close = LocalTime.of(20, 0);
    }

    public Church(LocalTime open, LocalTime close) {
        this.open = open;
        this.close = close;
    }

    @Override
    public LocalTime getOpen() {
        return open;
    }

    @Override
    public LocalTime getClose() {
        return close;
    }


    public void setOpen(LocalTime open) {
        this.open = open;
    }


    public void setClose(LocalTime close) {
        this.close = close;
    }
}
