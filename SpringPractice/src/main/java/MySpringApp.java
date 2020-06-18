import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class MySpringApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Point point = (Point) applicationContext.getBean("pointA");
        System.out.println(point.toString());
    }
}
