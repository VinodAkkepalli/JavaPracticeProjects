package example.designpattern.creational.builder;

/**
 * <b>Description</b> : Using builder to get the object in a single line of code and
 * without any inconsistent state or arguments management issues
 *
 * @author Vinod Akkepalli
 */

public class BuilderPatternTester {

    public static void main(String[] args) {

        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(comp);

        Computer comp1 = new Computer.ComputerBuilder("300 GB", "8 GB")
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(comp1);


        Computer comp2 = new Computer.ComputerBuilder("100 GB", "2 GB")
                .build();
        System.out.println(comp2);
    }

}
