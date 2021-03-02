package com.company;

import java.time.LocalTime;

public class Church extends Location implements Visitable {

    private LocalTime open;
    private LocalTime close;

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
