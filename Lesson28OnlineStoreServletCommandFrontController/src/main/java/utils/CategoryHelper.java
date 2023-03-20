package utils;

import lombok.experimental.UtilityClass;
import models.Category;

import java.util.List;

@UtilityClass
public class CategoryHelper {
    public static final List<Category> categories = List.of(
            new Category(1L, "Mobile phones", "mobile.jpg"),
            new Category(2L, "Laptops", "laptop.jpg"),
            new Category(3L, "GPS Navigators", "jps_nav.jpg"),
            new Category(4L, "Fridges", "fridge.jpg"),
            new Category(5L, "Cars", "car.jpg"),
            new Category(6L, "Cameras", "camera.jpg")
    );
}
