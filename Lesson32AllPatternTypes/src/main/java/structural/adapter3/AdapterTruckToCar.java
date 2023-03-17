package structural.adapter3;

public class AdapterTruckToCar implements Car {

    private MyTrack myTrack;

    public AdapterTruckToCar(MyTrack myTrack) {
        this.myTrack = myTrack;
    }


    @Override
    public void washCar() {
        myTrack.cleanTruck();
    }
}
