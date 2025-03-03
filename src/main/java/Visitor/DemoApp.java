package Visitor;

import java.util.ArrayList;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(5, 5));
        shapes.add(new Triangle(4, 3));

        ShapeVisitor shapeVisitor = new SVGExporter();
        for(Shape shape : shapes) {
            shape.accept(shapeVisitor);
        }
    }
}
