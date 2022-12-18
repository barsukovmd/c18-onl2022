package by.tms.transport.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

//В классе Воздушный добавляются поля:
//- Размах крыльев (м)
//- Минимальная длина взлётно-посадочной полосы для взлёта
@Setter
@Getter
@SuperBuilder
@ToString(callSuper = true)

public class AirTransport extends Transport {
    private double wingspan;
    private double minRunwayLength;

    @Override
    public String getInfo() {
        return super.getInfo() + " " + wingspan + " " + minRunwayLength;
    }
}
