package car;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Mileage {
    private int checkMileage;

    public Mileage(int checkMileage) {
        this.checkMileage = checkMileage;
    }

    public int checkDistance(int checkMileage) {
        if (checkMileage > 0) {
            for (int i = 0; i < checkMileage; i++) {
                checkMileage--;
            }
        }
        return checkMileage;
    }
}
