package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperWebSite implements Observed {
    private List<Observer> subscribers = new ArrayList<>();
    private List<String> vacancies = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void deleteVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.handleEvent(this.vacancies);
        }
    }
}
