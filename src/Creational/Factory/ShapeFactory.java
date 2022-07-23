package Creational.Factory;

public class ShapeFactory {
    private Shape shape;

    public Shape getShape(String whatShape) {
        if (whatShape.equals("square"))
            return new Square();
        else if (whatShape.equals("circle"))
            return new Circle();
        return null;
    }
}
