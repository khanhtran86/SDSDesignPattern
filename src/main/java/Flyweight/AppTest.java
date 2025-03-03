package Flyweight;

public class AppTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Red");
        circle.draw(10,10);

        Shape circle2 = ShapeFactory.getShape("Blue");
        circle2.draw(50,50);
    }
}
