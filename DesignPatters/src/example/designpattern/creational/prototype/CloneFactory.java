package example.designpattern.creational.prototype;

/**
 * <b>Description</b> :
 * Receives any Animal, or Animal subclass and makes a copy of it and stores it
 * in its own location in memory CloneFactory has no idea what these objects are
 * except that they are subclasses of Animal
 *
 * @author Vinod Akkepalli
 */
public class CloneFactory {
    public IAnimal getClone(IAnimal animalSample) {

        // Because of Polymorphism the Sheep's makeCopy() is called here instead of Animal's
        return animalSample.makeCopy();

    }

}