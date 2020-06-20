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

        //Object creation using bean name
        Circle circle = (Circle) applicationContext.getBean("circle-name");
        System.out.println(circle.toString());

        //Object creation using bean alias
        LineSegment lineSegment = (LineSegment) applicationContext.getBean("lineSegment-alias");
        System.out.println(lineSegment.toString());

        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        System.out.println(triangle.toString());

//        experiment with scope change for this class in spring xml and observe number of instances created
        ScopeTestClass scopeTestClass = (ScopeTestClass) applicationContext.getBean("scopeTestClass");
        System.out.println(scopeTestClass);

        ScopeTestClass scopeTestClass2 = (ScopeTestClass) applicationContext.getBean("scopeTestClass");
        System.out.println(scopeTestClass2);

        ContextUsingClass cuc = (ContextUsingClass) applicationContext.getBean("contextUsingClass");
        System.out.println(cuc.toString());

        Polygon polygon = (Polygon) applicationContext.getBean("childPolygon");
        System.out.println(polygon.toString());
    }
}
