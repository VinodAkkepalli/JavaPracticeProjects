package example.designpattern.creational.prototype;

/**
 * <b>Description</b> :
 * By making this class cloneable we are making the instances of this class cloneable
 * These instance copies have different results when
 * System.identityHashCode(System.identityHashCode(bike)) is called
 *
 * @author Vinod Akkepalli
 */

public interface IAnimal extends Cloneable {

    IAnimal makeCopy();

}
