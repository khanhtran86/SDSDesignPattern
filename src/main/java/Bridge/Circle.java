package Bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Circle");
        color.setColor();
    }
}
