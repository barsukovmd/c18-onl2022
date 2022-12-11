package by.tms.homework1.model;

import by.tms.homework1.service.Instrument;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class InstrumentCreation implements Instrument {
    private Instrument instrument;

    public InstrumentCreation(Instrument instrument) {
        this.instrument = instrument;
    }

    public void createInstrument(Instrument instrument) {
        Instrument[] instruments = new Instrument[Type.values().length];
        for (int i = 0; i < instruments.length; i++) {
            Instrument exactInstrument = instruments[i];
            instruments[i] = exactInstrument;
        }
        instrument.play();
    }

    @Override
    public void play() {
    }
}
