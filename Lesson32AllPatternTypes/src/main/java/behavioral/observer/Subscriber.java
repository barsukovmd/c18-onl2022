package behavioral.observer;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Subscriber implements Observer {
    private String name;

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + " vacancies are available at the moment\n " + vacancies
                + "\n=========================================================================\n");
    }
}
