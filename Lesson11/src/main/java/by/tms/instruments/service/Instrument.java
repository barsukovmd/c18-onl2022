package by.tms.instruments.service;

public interface Instrument {
    String KEY = "До мажор";

    enum Type {
        DRUM, GUITAR, TRUMPET
    }

    void play();
}
