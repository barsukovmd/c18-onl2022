package car;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FuelTank {
    private int tankVolume;

    public FuelTank(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public int checkFuel(int tankVolume) {
        tankVolume = 100;
        for (int i = 0; i < tankVolume; i++) {
            tankVolume--;
        }
        if (tankVolume < 0) {
            System.out.println("Car should be refilled");
            return 0;
        } else {
            System.out.println("You can drive the car");
        }
        return tankVolume;
    }
}
