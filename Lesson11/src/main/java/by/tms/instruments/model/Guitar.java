package by.tms.instruments.model;

import by.tms.instruments.service.Instrument;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Guitar implements Instrument {

    private int countStrings;

    public Guitar(int countStrings) {
        this.countStrings = countStrings;
    }

    @Override
    public void play() {
        System.out.println("Guitar plays with " + countStrings + " number of strings");
    }
}
