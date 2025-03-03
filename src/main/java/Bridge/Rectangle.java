package Bridge;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Rectangle ");
        color.setColor();
    }
}
