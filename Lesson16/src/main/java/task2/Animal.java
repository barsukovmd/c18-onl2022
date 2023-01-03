package task2;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Animal implements AnimalAware, Serializable {
    private String type;
    private int age;

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println(type + "is running");
    }
}
