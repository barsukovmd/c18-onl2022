package homework9Task1;

import lombok.Getter;

@Getter


public enum Seasons {

    SPRING("Spring! Too early", 15), SUMMER("Summer! Too hot", 30), AUTUMN("Autumn! Favourite", 10), WINTER("Winter! Too cold", -10);

    private final String seasons;
    private final int temperature;

    Seasons(String seasons, int temperature) {
        this.seasons = seasons;
        this.temperature = temperature;
    }


}
