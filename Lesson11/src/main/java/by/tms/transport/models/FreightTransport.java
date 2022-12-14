package by.tms.transport.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

//В конечных классах (Легковой, Грузовой, Военный, Гражданский)
//разработать метод описание который будет возвращать составленную строку
//с описанием всех характеристик объекта. В строку включить ещё один
//параметр мощность в киловаттах (кВ) . Расчёт мощности в киловаттах
//производится в отдельном методе :
//
//1 л.с = 0.74 кВ
@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class FreightTransport extends GroundTransport {
    private double loadCapacity;

    @Override
    public String getInfo() {
        return super.getInfo() + " " + loadCapacity;
    }

    public void checkCapacityWeight(double weight) {
        if (weight < loadCapacity) {
            System.out.println("Freight transport is not full yet");
        } else if (weight == loadCapacity) {
            System.out.println("Freight transport is full");
        } else {
            System.out.println("Freight transport has been overwhelmed, pls unload or take another one");
        }
    }
}
