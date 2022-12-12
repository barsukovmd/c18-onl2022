package by.tms.homework1.model;

import by.tms.homework1.service.Instrument;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Guitar implements Instrument {

    private int countStrings;

    @Override
    public void play() {
        countStrings = 7;
        System.out.println("Guitar plays with " + countStrings + " number of strings");
    }
}
