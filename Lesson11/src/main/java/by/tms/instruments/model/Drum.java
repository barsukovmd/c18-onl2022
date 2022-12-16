package by.tms.instruments.model;

import by.tms.instruments.service.Instrument;

public class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Drum plays with " + size + " cm of diameter");
    }
}
