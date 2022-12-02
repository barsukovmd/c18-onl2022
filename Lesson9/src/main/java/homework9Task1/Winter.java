package homework9Task1;

import lombok.Getter;

@Getter

public class Winter extends AllSeasons {
    public Winter(int temperature, Seasons seasons) {
        super(temperature, seasons);
    }
}
