package Creational.AbstractFactory;

public class ColoredShapeFactory extends AbstractFactory{
    public Shape getShape(String whatShape) {
        if (whatShape.equals("square"))
            return new ColoredSquare();
        else if (whatShape.equals("circle"))
            return new ColoredCircle();
        return null;
    }
}
