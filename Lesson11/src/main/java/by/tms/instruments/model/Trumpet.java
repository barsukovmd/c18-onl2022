package by.tms.instruments.model;

import by.tms.instruments.service.Instrument;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        diameter = 10;
        System.out.println("Trumpet plays with " + diameter + " diameter 10cm");
    }
}
