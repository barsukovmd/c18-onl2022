package by.tms.shuttle.model;

import by.tms.shuttle.service.IStart;
import lombok.experimental.SuperBuilder;

import static by.tms.shuttle.model.Type.ONESPACE;

@SuperBuilder
public class OneSpace implements IStart {
    public OneSpace() {
    }

    @Override
    public boolean checkPreStart() {
        System.out.println("Start was initiated by " + ONESPACE);
        return true;
    }

    @Override
    public void engineOn() {
        System.out.println(ONESPACE + " Engines are on. All systems are in good condition");
    }

    @Override
    public void start() {
        System.out.println("Start of " + ONESPACE);
    }
}
