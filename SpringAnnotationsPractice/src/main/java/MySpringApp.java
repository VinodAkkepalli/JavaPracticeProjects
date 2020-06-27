import com.practice.spring.shapes.Circle;
import com.practice.spring.shapes.LineSegment;
import com.practice.spring.shapes.Point;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class MySpringApp {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        applicationContext.registerShutdownHook();

        Point point = (Point) applicationContext.getBean("zeroPoint");
        System.out.println(point.toString());

        Circle circle = (Circle) applicationContext.getBean("circle");
        System.out.println(circle.toString());

        LineSegment lineSegment = (LineSegment) applicationContext.getBean("lineSegment");
        System.out.println(lineSegment.toString());
    }
}
