package behavioral.observer;

public class MainObserver {
    public static void main(String[] args) {
        JavaDeveloperWebSite jobSite = new JavaDeveloperWebSite();
        jobSite.addVacancy("Vacancy for Developers #1");
        jobSite.addVacancy("Vacancy for Developers #2");
        Observer subscriber1 = new Subscriber("Yauhen Barsukov");
        Observer subscriber2 = new Subscriber("Ilya Maksimov");
        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);
        jobSite.addVacancy("Vacancy for Developers #3");
    }
}
