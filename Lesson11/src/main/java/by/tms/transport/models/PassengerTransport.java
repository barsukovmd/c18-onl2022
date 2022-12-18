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
public class PassengerTransport extends GroundTransport {
    private String bodyType;
    private int passengerCount;

    @Override
    public String getInfo() {
        return super.getInfo() + " " + bodyType + " " + passengerCount;
    }

    //Для легкового разработать метод который будет принимать время и считать
//сколько километров проедет машина двигаясь с максимальной скоростью и
//сколько топлива она израсходует за это время, результат вывести в консоль,
//расчёт израсходуемого топлива вынести в отдельный метод private.

    ////Результат работы метода должен вывести такую строчку:
////За время (ваше введённое время) ч, автомобиль (марка автомобиля)
////двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
////проедет (xxx) км и израсходует (xxx) литров топлива.
    public void checkCarParameters(double time) {
        double distance = getMaxSpeed() * time;
        System.out.println("During the time " + time + " hours. Car "
                + getBrand() + " brand moved wth maximum "
                + "speed of " + getMaxSpeed()
                + " km/h can ride for "
                + distance + " distance and can consume "
                + checkFuelConsumption(time) + " liters of fuel");
    }

    private double checkFuelConsumption(double time) {
        double distance = getMaxSpeed() * time;
        return distance * getFuelConsumption() / 100;
    }

}
