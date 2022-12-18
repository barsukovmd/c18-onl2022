package by.tms.transport.service;

import by.tms.transport.models.FreightTransport;
import by.tms.transport.models.MilitaryTransport;
import by.tms.transport.models.PassengerTransport;
import by.tms.transport.models.Transport;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transport> transports = new ArrayList<>();
        transports.add(PassengerTransport.builder()
                .bodyType("SUV")
                .brand("Lincoln")
                .mass(3500)
                .power(300)
                .maxSpeed(280)
                .fuelConsumption(20)
                .passengerCount(6)
                .wheelCount(4)
                .build());

        transports.add(FreightTransport.builder()
                .loadCapacity(400)
                .brand("MAN")
                .mass(10500)
                .power(280)
                .maxSpeed(240)
                .fuelConsumption(50)
                .wheelCount(8)
                .build());

        transports.add(MilitaryTransport.builder()
                .brand("Zil")
                .mass(10000)
                .maxSpeed(180)
                .power(300)
                .wingspan(120)
                .checkCatapultSystem(true)
                .countRockets(10)
                .build());

        for (Transport transport : transports) {
            if (transport instanceof PassengerTransport passengerTransport) {
                passengerTransport.checkCarParameters(10);//не мог понять почему не находит метод
            } else if (transport instanceof MilitaryTransport militaryTransport) {
                militaryTransport.catapultCheck();
                militaryTransport.shootRocket();
            } else if (transport instanceof FreightTransport freightTransport) {
                freightTransport.checkCapacityWeight(300);
            }
        }
    }
}
