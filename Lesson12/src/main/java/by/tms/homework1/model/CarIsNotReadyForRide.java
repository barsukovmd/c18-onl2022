package by.tms.homework1.model;

import lombok.ToString;

@ToString

public class CarIsNotReadyForRide extends Exception {
    public CarIsNotReadyForRide(String message) {
        super(message);
    }
}
