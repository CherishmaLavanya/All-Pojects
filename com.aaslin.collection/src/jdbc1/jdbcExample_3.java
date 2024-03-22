package jdbc1;

import java.util.ArrayList;
import java.util.List;

class Emp {
	int id;
	String name;
	List<String> data;

	Emp(int id, String name, List<String> data) {
		this.id = id;
		this.name = name;
		this.data = data;
	}

	void updateName(String name) {
		this.name = name;
	}
}

public class jdbcExample_3 {

	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		data.add("IT");
		data.add("HR");
		Emp e = new Emp(1, "varma", data);
		System.out.println(e.id + " " + e.name + " " + data);

		data.remove("HR");
		System.out.println(e.id + " " + e.name + " " + data);
		e.updateName("reshmika");
		System.out.println(e.id + " " + e.name + " " + data);
		data.clear();
		System.out.println(e.id + " " + e.name + " " + data);

	}

}
