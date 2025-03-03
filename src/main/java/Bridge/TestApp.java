package Bridge;

public class TestApp {
    public static void main(String[] args) {
        Color color = new Yello();
        Rectangle redRectangle = new Rectangle(color);

        redRectangle.draw();

        Circle redCircle = new Circle(color);
        redCircle.draw();
    }
}
