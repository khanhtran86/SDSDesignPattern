package Visitor;

public class SVGExporter implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("<circle r=\"" + circle.getRadius() + "\"/>");
    }

    @Override
    public void visit(Rectangle circle) {
        System.out.println("<rect width=\"" + circle.getWidth() + "\" height=\"" + circle.getHeight() + "\"/>");
    }

    @Override
    public void visit(Triangle circle) {
        System.out.println("<polygon r=\"" + circle.getBase() + " " + circle.getHeight() + "\"/>");
    }
}
