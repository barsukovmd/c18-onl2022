package by.tms.homework1.service;

public interface Instrument {
    String KEY = "До мажор";

    enum Type {
        DRUM, GUITAR, TRUMPET;
    }

    void play();
}
