package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum FlowerType {
    ROSE(15, "ROSE"), LILY(7, "LILY"),
    ASTER(5, "ASTER"), GERBERA(5, "GERBERA"),
    TULIP(8, "TULIP"), CARNATION(11, "CARNATION");
    private final int price;
    private final String name;
}
