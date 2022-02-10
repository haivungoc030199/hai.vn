import edu.java.spring.HelloClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        HelloClass obj=(HelloClass)context.getBean("HelloJavaClass");
        obj.printMessage();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();





    }
}
