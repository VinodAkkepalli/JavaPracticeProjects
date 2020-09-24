package example.designpattern.creational.abstractfactory;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */

public class PCFactory implements IComputerFactory {

    private final String ram;
    private final String hdd;
    private final String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }

}
