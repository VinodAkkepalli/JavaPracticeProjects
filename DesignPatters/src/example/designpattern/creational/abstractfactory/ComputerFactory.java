package example.designpattern.creational.abstractfactory;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */

public class ComputerFactory {

    public static Computer getComputer(IComputerFactory factory){
        return factory.createComputer();
    }
}
