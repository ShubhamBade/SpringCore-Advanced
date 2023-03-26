package practice.coreSpring.StandAlonePrac;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	List<String> list;
	Map<String, String> map;
	Properties prop;
	
	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [list=" + list + "\n map=" + map + "\n prop=" + prop + "]";
	}

	

	

}
