package practice.coreSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World Java!" );
    	ApplicationContext context= new ClassPathXmlApplicationContext("core_config.xml");
    	Employee e=(Employee)context.getBean("emp1");
    	System.out.println(e);
    }
}
