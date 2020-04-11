package example.dp.singleton;

/**
 * <b>Java code for Bill Pugh Singleton Implementation</b> :
 *
 * @author Vinod Akkepalli
 */
public class SimpleSingletonRajni {

    private SimpleSingletonRajni() {
    }

    private static class StaticInnerClass {
        private static final SimpleSingletonRajni INSTANCE = new SimpleSingletonRajni();
    }

    public static SimpleSingletonRajni getInstance() {
        return StaticInnerClass.INSTANCE;
    }
}