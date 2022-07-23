package Creational.AbstractFactory;

public class FactoryMaker {
    public static AbstractFactory getFactory(boolean factoryColored){
        if (factoryColored){
            return new ColoredShapeFactory();
        }
        else {
            return new ShapeFactory();
        }
    }
}
