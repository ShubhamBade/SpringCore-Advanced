package practice.coreSpring.xmlRemove;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Xml Complete Removal");
		 * 
		 * ApplicationContext context= new
		 * ClassPathXmlApplicationContext("core_Config4.xml");
		 * 
		 * Student s= context.getBean("student", Student.class);
		 * 
		 * System.out.println(s);
		 */
		
		System.out.println("Without using Xml file- Configuration Class");
		
		ApplicationContext con=new  AnnotationConfigApplicationContext(javaConfig.class);
		Student stud= con.getBean("student", Student.class);
		System.out.println(stud);
		
		
		System.out.println("Now we are removing @Component as well");
		ApplicationContext app= new AnnotationConfigApplicationContext(javaConfig.class);
		RemoveCom rem= app.getBean("getRemoveCome",RemoveCom.class);
		System.out.println(rem);
	}

}
