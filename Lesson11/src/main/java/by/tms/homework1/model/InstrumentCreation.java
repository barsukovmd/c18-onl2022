package by.tms.homework1.model;

import by.tms.homework1.service.Instrument;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@Getter
@ToString
public class InstrumentCreation implements Instrument {

    @Override
    public void play() {
    }

    //бывает пишу, понимаю, а бывает день, когда туплю и сижу часами, чтобы заполнить массив
    public Instrument createInterface(Instrument.Type instrument) {
        Instrument[] instruments = new Instrument[Instrument.Type.values().length];
        for (int i = 0; i < instruments.length; i++) {
            Instrument instrument1 = instruments[i];
            return instrument1;
        }
        return null;
    }
}
