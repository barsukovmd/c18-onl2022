package by.tms.shuttle.model;

import by.tms.shuttle.service.IStart;
import lombok.experimental.SuperBuilder;

import static by.tms.shuttle.model.Type.SHUTTLE;

@SuperBuilder
public class Shuttle implements IStart {
    public Shuttle() {
    }

    @Override
    public boolean checkPreStart() {
        System.out.println("Start was initiated by " + SHUTTLE);
        return true;
    }

    @Override
    public void engineOn() {
        System.out.println(SHUTTLE + " Engines are on. All systems are in good condition");
    }

    @Override
    public void start() {
        System.out.println("Start of " + SHUTTLE);
    }
}
