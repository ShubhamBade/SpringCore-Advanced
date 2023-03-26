package practice.coreSpring.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Streotype");
		
		ApplicationContext con=new ClassPathXmlApplicationContext("core_Config3.xml");
		Student s=(Student)con.getBean("stud");//or we can use class name in camel format
//		System.out.println(s);
		
		
		Student s2=con.getBean("stud", Student.class);
		/*refer same has code- same object but different reference for this 
		 we are using bean scope-two ways- using xml and annotation
		 <bean class="" name="" scope=""/>
		 @scope();
		 */
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		//after @scope i can get different hasCode it creates two different objects
		
		Teacher t=con.getBean("t1", Teacher.class);
		System.out.println(t.hashCode());
		Teacher t2=con.getBean("t1", Teacher.class);
		System.out.println(t2.hashCode());
		
		
		//SpEL language
		SpEL sp=con.getBean("spEL",SpEL.class);
		System.out.println(sp);
		
		/*
		 * SpelExpressionParser temp= new SpelExpressionParser(); Expression
		 * ex=(Expression) temp.parseExpression("10+20");
		 * System.out.println(ex.getValue());
		 */
		
		
		
	}

}
