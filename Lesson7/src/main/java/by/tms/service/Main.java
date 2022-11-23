package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", "16gb", "512gb", 1000);
        for (int i = 0; i < 1000; i++) {
            computer.on();
            computer.off();
        }

    }
}
