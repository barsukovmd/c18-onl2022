package by.tms.transport.models;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

//В классе Транспорт есть поля:
//- Мощность(в лошадиных силах)
//- Максимальная скорость(км/ч)
//- Масса (кг)
//- Марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. )
@SuperBuilder
@ToString
@Getter
public class Transport {
    private double power;
    private double maxSpeed;
    private double mass;
    private String brand;

    public double getPower() {
        return power * 0.746;
    }

    public String getInfo() {
        return brand + " " + getPower() + " " + maxSpeed + " " + mass;
    }
}
