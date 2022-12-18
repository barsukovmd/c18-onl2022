package by.tms.shuttle.model;

import by.tms.shuttle.service.IStart;
import lombok.experimental.SuperBuilder;

import java.util.concurrent.TimeUnit;

@SuperBuilder
public class Spaceport {
    public Spaceport() {
    }

    public void start(IStart start) throws InterruptedException {
        if (!start.checkPreStart()) {
            System.out.println("Pre start check has failed ");
        } else {
            start.engineOn();
            System.out.println("Shuttle is ready to fly...Engine is on ");
            System.out.println("Counting down...");
            for (int i = 10; i >= 0; i--) {
                System.out.println(i + "...");
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}
