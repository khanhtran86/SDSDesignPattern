package Visitor;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle circle);
    void visit(Triangle circle);
}
