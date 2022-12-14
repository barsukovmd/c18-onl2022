package by.tms.homework1.model;

import by.tms.homework1.service.Instrument;
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
