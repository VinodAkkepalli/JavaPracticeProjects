import com.practice.spring.shapes.Circle;
import com.practice.spring.shapes.Point;
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

        Point point = (Point) applicationContext.getBean("zeroPoint");
        System.out.println(point.toString());

        Circle circle = (Circle) applicationContext.getBean("circle");
        System.out.println(circle.toString());
    }
}
