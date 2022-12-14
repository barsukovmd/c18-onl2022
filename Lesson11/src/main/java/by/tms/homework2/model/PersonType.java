package by.tms.homework2.model;

import by.tms.homework2.service.ManClothes;
import by.tms.homework2.service.WomanClothes;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum PersonType {
    MAN(ManClothes.class), WOMAN(WomanClothes.class);
    private final Class check;
}
