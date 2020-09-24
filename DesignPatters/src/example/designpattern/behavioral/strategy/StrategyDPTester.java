package example.designpattern.behavioral.strategy;

/**
 * <b>Description</b> : Strategy Design Pattern
 * https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
 * https://www.youtube.com/watch?v=-NCgRD9-C6o
 *
 * @author Vinod Akkepalli
 */
public class StrategyDPTester {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Name on card", "1234567890123456", "786", "12/15"));
    }
}
