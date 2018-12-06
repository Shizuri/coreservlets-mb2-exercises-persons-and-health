package persons;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PersonHandler {

	private String name = "David";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String response() {
		return "response-person";
	}
}
