package behavioral.strategy;

import lombok.*;

@Getter
@Setter
public class Developer {
    private Activity activity;

    public void executeActivity() {
        activity.justDoIt();
    }
}
