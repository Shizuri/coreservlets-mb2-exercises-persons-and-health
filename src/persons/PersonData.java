package persons;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PersonData{

	private List<Person> personObjectList;
	
	public PersonData() {
		personObjectList = new ArrayList<>();
		personObjectList.add(new Person("Cay", "Cay Horstmann"));
		personObjectList.add(new Person("David", "David Geary"));
		personObjectList.add(new Person("Marty", "Marty Hall"));
	}

	public List<Person> getPersonObjectList() {
		return personObjectList;
	}
	
}
