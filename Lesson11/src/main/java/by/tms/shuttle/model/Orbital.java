package by.tms.shuttle.model;

import by.tms.shuttle.service.IStart;
import lombok.experimental.SuperBuilder;

import static by.tms.shuttle.model.Type.ORBITAL;

@SuperBuilder
public class Orbital implements IStart {


    @Override
    public boolean checkPreStart() {
        System.out.println("Start was initiated by " + ORBITAL);
        return true;
    }

    @Override
    public void engineOn() {
        System.out.println(ORBITAL + " Engines are on. All systems are in good condition");
    }

    @Override
    public void start() {
        System.out.println("Start of " + ORBITAL);
    }
}
