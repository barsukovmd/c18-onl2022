package car;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Engine {
    private boolean isOn = true;
    private int resourceOfEngine = 1000;

    public void on() {
        if (isOn) {
            System.out.println("Car engine is turned on");
        } else {
            System.out.println("Please turn on your car engine");
        }
    }

    public void off() {
        if (!isOn) {
            System.out.println("Please turn off the engine");
        }
    }

    public int checkResourceOfEngine(int resourceOfEngine) {
        for (int i = 0; i < 1000; i++) {
            resourceOfEngine--;
        }
        return resourceOfEngine;
    }
}
