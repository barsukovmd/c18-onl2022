package test;

import java.util.ArrayList;
import java.util.List;

public class MainShape {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        Canvas canvas = new Canvas();
        canvas.drawAll(circles);
    }
}
