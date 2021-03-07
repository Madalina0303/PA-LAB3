package com.company;

import java.time.LocalTime;

public interface Visitable {

    LocalTime getOpen();

    LocalTime getClose();

    void setOpen(LocalTime open);

    void setClose(LocalTime close);


}
