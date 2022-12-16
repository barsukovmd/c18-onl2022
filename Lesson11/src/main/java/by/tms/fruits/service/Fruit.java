package by.tms.fruits.service;

// * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
////        * Метод должен учитывать вес фрукта(Т.е в зависимости от веса разная цена)
////        * Создать несколько объектов разных классов.
////        * Подсчитать общую стоимость проданных фруктов.
////        * А также общую стоимость отдельно проданных яблок, груш и абрикос.
public abstract class Fruit {
    private String weight;
    private int price;

    public Fruit(String weight) {
        this.weight = weight;
    }

    public void getPrice() {

    }

    public final void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }
}
