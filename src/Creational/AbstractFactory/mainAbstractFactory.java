package Creational.AbstractFactory;

public class mainAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory asf = FactoryMaker.getFactory(false);
        Shape s1 = asf.getShape("circle");
        s1.draw();

        AbstractFactory asf1 = FactoryMaker.getFactory(true);
        Shape s2 = asf1.getShape("circle");
        s2.draw();
    }
}
