package practice.coreSpring.streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stud") // to specify bean id or name
@Scope("prototype")// use to change the scope of object by default singleton 
public class Student {
	@Value("Shubham")
	private String name;
	@Value("Pune")
	private String city;
	@Value("#{list}")
	private List<String> list;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "\n city=" + city + "\n Education=" + list + "]";
	}
	
	
	

}
