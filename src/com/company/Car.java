package com.company;

public interface Car {

    default int getNumberDoor() {
        return 5;
    }
}
