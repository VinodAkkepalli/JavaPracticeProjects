package example.designpattern.structural.decorator;

/**
 * <b>Description</b> : https://www.youtube.com/watch?v=j40kRwSm4VE
 *  https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
 *
 * @author Vinod Akkepalli
 */
public class PizzaMaker {

    public static void main(String[] args){

        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());

    }

}