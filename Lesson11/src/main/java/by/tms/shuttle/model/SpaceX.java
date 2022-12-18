package by.tms.shuttle.model;

import by.tms.shuttle.service.IStart;
import lombok.experimental.SuperBuilder;

import static by.tms.shuttle.model.Type.SPACEX;

@SuperBuilder
public class SpaceX implements IStart {

    @Override
    public boolean checkPreStart() {
        System.out.println("Start was initiated by " + SPACEX);
        return true;
    }

    @Override
    public void engineOn() {
        System.out.println(SPACEX + " Engines are on. All systems are in good condition");
    }

    @Override
    public void start() {
        System.out.println("Start of " + SPACEX);
    }
}
