package example.designpattern.creational.abstractfactory;

/**
 * <b>Description</b> : Abstract Factory Design pattern
 * https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java
 * https://youtu.be/BPkYkyVWOaw
 *
 * @author Vinod Akkepalli
 */

public class AbstractFactoryDPTester {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {

        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);

        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
