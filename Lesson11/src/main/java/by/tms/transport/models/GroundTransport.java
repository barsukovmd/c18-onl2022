package by.tms.transport.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
public class GroundTransport extends Transport {
    private int wheelCount;
    private double fuelConsumption;//100 km

    @Override
    public String getInfo() {
        return super.getInfo() + " " + wheelCount + " " + fuelConsumption;
    }
}
