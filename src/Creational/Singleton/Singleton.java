package Creational.Singleton;

public class Singleton {
    private static boolean isExist = false;
    private static Singleton singleton;

    private Singleton(){
        // code to initialize data
    }

    // the function is static so other classes can ask for the object without making an instance of it
    public static Singleton getInstance(){
        if (isExist)
            return singleton;

        singleton = new Singleton();
        isExist = true;
        return singleton;
    }
}
