package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    //Use to cache circle by color
    private static Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Create new Circle at color "+ color);
        }
        return circle;
    }
}
