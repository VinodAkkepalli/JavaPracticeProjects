package practice.streams;

/**
 * <b>Description</b> : Static & Default methods of Functional Interfaces
 *  Diamond problem in case of multiple interface implementations
 *
 * @author Vinod Akkepalli
 */

@FunctionalInterface
interface MyFunctionalInterface1 {
    // Single abstract method
    void abstractMethod();

    // static methods
    static void method1(){
        System.out.println("Method1 Static");
    }
    static void method3(){
        System.out.println("Method3 Static");
    }

    // Default methods
    default void method2(){
        System.out.println("Method2 Default");
    }

    default void method4(){
        System.out.println("Method4 Default");
    }

    // Method of Object class declared as Abstract method does not count
    boolean equals(Object o);
}

@FunctionalInterface
interface MyFunctionalInterface2 {
    void abstractMethod2();

    // Default method
    default void method2(){
        System.out.println("MyFunctionalInterface2::Method2 Default");
    }
}

// Diamond problem arises when we don't inherit common default method myMethod2
class ClassForDiamondProblemDemo implements MyFunctionalInterface1, MyFunctionalInterface2 {

    @Override
    public void abstractMethod() {
        System.out.println("ClassForDiamondProblemDemo::abstractMethod()");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("ClassForDiamondProblemDemo::abstractMethod2()");
    }

    @Override
    public void method2() {
        System.out.println("ClassForDiamondProblemDemo::method()");
    }
}

public class FunctionalInterfacesStaticDefaultMethods {

    public static void main(String[] args) {
        FunctionalInterfacesStaticDefaultMethods fim = new FunctionalInterfacesStaticDefaultMethods();
        // Lambda function using MyFunctionalInterface
        MyFunctionalInterface1 mfi = () -> System.out.println("MyFunctionalInterface implemented");
        mfi.abstractMethod();

        mfi.method2();  // Default method accessed
        MyFunctionalInterface1.method1();    //Static method accessed


        ClassForDiamondProblemDemo cdp = new ClassForDiamondProblemDemo();
        cdp.abstractMethod();
        cdp.abstractMethod2();
        cdp.method2();
    }
}