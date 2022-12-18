package seasons;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString


public enum Seasons {

    SPRING("Spring! Too early", 15),
    SUMMER("Summer! Too hot", 30) {
        @Override
        public String getInfo() {
            return "Теплое время года";
        }
    },
    AUTUMN("Autumn! Pretty nice weather", 10),
    WINTER("Winter! Too cold", -10);

    private final String info;
    private final int temperature;

    Seasons(String info, int temperature) {
        this.info = info;
        this.temperature = temperature;
    }

    public String getInfo() {
        return info;
    }

}
