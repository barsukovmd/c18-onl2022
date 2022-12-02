package homework9Task1;

public class AllSeasons {
    private int temperature;
    private Seasons seasons;

    public AllSeasons(int temperature, Seasons seasons) {//не очень понял где нужно создать конструктор и создал в enam и здесь в классе
        this.temperature = temperature;
        this.seasons = seasons;
    }

    public void favouriteSeason(Seasons seasons) {
        System.out.println("My favourite season throughout the year is " + seasons);
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }
}
