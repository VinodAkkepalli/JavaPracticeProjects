package example.designpattern.creational.prototype;

/**
 * <b>Description</b> : Prototype Design Pattern
 * https://www.youtube.com/watch?v=AFbZhRL0Uz8&feature=youtu.be
 *
 * @author Vinod Akkepalli
 */
public class PrototypeDPTester {

    public static void main(String[] args) {

        // Handles routing makeCopy method calls to the right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance
        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own memory location
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        // These are exact copies of each other
        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }

}
