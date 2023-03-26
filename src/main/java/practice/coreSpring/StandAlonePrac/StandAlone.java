package practice.coreSpring.StandAlonePrac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello standAlone Collections");
		ApplicationContext context= new ClassPathXmlApplicationContext("core_Config2.xml");
		Person p=(Person)context.getBean("per1");
		
		System.out.println(p);
		System.out.println(p.getList().getClass().getName()+"\n"+p.getMap().getClass().getName()+"\n"+p.getProp().getClass().getName());
		
	}

}
