package example.designpattern.creational.abstractfactory;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class ServerFactory implements IComputerFactory {

    private final String ram;
    private final String hdd;
    private final String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }

}
