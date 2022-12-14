package by.tms.clothes.model;

import by.tms.clothes.service.ManClothes;
import by.tms.clothes.service.WomanClothes;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum PersonType {
    MAN(ManClothes.class), WOMAN(WomanClothes.class);
    private final Class check;
}
