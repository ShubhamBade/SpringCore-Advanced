package practice.coreSpring.xmlRemove;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("VivoBook")
	String name;
	@Value("Pune, Maharashtra")
	String city;
	@Value("India")
	String country;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
