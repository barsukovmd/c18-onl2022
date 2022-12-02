package homework9Task1;

public class Summer extends AllSeasons {// создал доп классы, чтобы потренировать наследование и конструкторы


    public Summer(int temperature, Seasons seasons) {
        super(temperature, seasons);
    }

    @Override
    public void getDescription() {
//        super.getDescription(); // нельзя ставить, чтобы не было повторения предыдущего метода
        System.out.println("Теплое время года");
    }
}
