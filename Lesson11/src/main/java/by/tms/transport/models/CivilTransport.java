package by.tms.transport.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

//В классе Гражданский добавляются поля:
//- Кол-во пассажиров
//- Наличие бизнес класса (true/false)

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
public class CivilTransport extends AirTransport {
    private int countPassengers;
    private boolean checkBusinessClass;

    @Override
    public String getInfo() {
        return super.getInfo() + " " + countPassengers + " " + countPassengers + " ";
    }
}
