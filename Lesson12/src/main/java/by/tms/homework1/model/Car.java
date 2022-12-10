package by.tms.homework1.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString

public class Car {
    private String brand;
    private int speed;
    private int price;
    private boolean checkEngine = true;
    private boolean checkFuel = true;
    private boolean checkMiles = true;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public void checkEngine() {
        if (checkEngine) {
            System.out.println("Car is turned on");
            checkEngine = true;
        } else {
            System.out.println("Car is turned off");
        }
    }

    public void checkFuel() {
        if (checkEngine && checkEngine) {
            System.out.println("Fuel is Full");
        } else {
            System.out.println("Fuel is Empty");
        }
    }

    public void checkDistance() {
        if (checkEngine && checkFuel && checkMiles) {
            System.out.println("Car resource is in good condition");
        } else {
            System.out.println("Car resource is empty");
        }
    }

    public void start() throws CarIsNotReadyForRide {
        Random random = new Random();
        int x = random.nextInt(21);
        if (x % 2 == 0) {
            ride();
            System.out.println("Car is ready for ride");
        } else {
            System.out.println("Car should be checked");
        }
    }

    public void ride() throws CarIsNotReadyForRide {
        if (checkEngine && checkFuel && checkMiles) {
            checkFuel();
            checkEngine();
            checkDistance();
        } else {
            throw new CarIsNotReadyForRide(brand + " is not ready for ride, please check engine, fuel and car resource");
        }
    }


}