package by.tms.homework.service.exercise4;

import java.io.*;

public class Exercise4 {
    private static String OUTPUT = "Lesson15/src/main/resources/car";

    public static void main(String[] args) {
        Car car = new Car("Mercedes", 280, 80000);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(OUTPUT))) {
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car carFromFile = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(OUTPUT))) {
            carFromFile = (Car) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(carFromFile);
    }
}
