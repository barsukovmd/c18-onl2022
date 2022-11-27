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

    public void checkMileage(int checkMileage) {
        checkMileage = 0;
        for (int i = 0; i >= checkMileage; i++) {
            checkMileage++;
        }
        System.out.println(checkMileage + " mileage passed");
    }

}
