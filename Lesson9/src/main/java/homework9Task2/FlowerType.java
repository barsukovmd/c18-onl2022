package homework9Task2;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum FlowerType {
    ROSE(15, "ROSE"), LILY(7, "LILY"),
    ASTER(5, "ASTER"), GERBERA(5, "GERBERA"),
    TULIP(8, "TULIP"), CARNATION(11, "CARNATION"),
    ;
    private int price;
    private String name;

    FlowerType(int price, String name) {
        this.price = price;
        this.name = name;
    }
}
