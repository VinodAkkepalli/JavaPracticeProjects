package example.designpattern.creational.prototype;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class Sheep implements IAnimal {

    public Sheep(){
        System.out.println("Sheep is Made");
    }

    public IAnimal makeCopy() {

        System.out.println("Sheep is Being Made");
        Sheep sheepObject = null;

        try {
            // Calls the Animal super class's clone()
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
//            This exception occurs if Animal didn't extend Cloneable
            System.out.println("CloneNotSupportedException thrown");
            e.printStackTrace();
        }

        return sheepObject;
    }

    public String toString(){
        return "Dolly is my Hero, Baaaaa";
    }

}
