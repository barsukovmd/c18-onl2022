package by.tms.transport.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

//В классе Военный добавляются поля:
//- Наличие системы катапультирования (true/false)
//- Кол-во ракет на борту

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
public class MilitaryTransport extends AirTransport {
    private boolean checkCatapultSystem;
    private int countRockets;

    @Override
    public String getInfo() {
        return super.getInfo() + " " + checkCatapultSystem + " " + countRockets;
    }

    public void shootRocket() {
        if (countRockets > 0) {
            System.out.println("Rocket is coming...");
            countRockets--;
        } else {
            System.out.println("Empty, no rockets");
        }
    }

    public void catapultCheck() {
        if (checkCatapultSystem) {
            System.out.println("Catapult has been completed successfully");
            checkCatapultSystem = true;
        } else {
            System.out.println("You don't have this system");
        }
    }
}
