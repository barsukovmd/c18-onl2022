package car;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Mileage {
    private int checkMileage;

    public Mileage(int checkMileage) {
        this.checkMileage = checkMileage;
    }
}
