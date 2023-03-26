package practice.coreSpring.xmlRemove;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "practice.coreSpring.xmlRemove")
public class javaConfig {
		
		//return bean object to ioc container methodname and bean name should be same
		//RemoveCom rem= app.getBean("getRemoveCome",RemoveCom.class);
		@Bean
		public RemoveCom getRemoveCome() {
			RemoveCom obj= new RemoveCom();
			return obj;
		}
}
