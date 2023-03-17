package structural.adapter3;

public class MyTrack implements Truck {

    @Override
    public void cleanTruck() {
        System.out.println("My truck is cleaning");
    }
}
