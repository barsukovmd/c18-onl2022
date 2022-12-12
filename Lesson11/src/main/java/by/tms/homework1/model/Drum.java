package by.tms.homework1.model;

import by.tms.homework1.service.Instrument;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class Drum implements Instrument {
    private int size;

    @Override
    public void play() {
        size = 30;
        System.out.println("Drum plays with " + size + " size 30cm");
    }
}
