import java.io.Serializable;

public class EmployeeApp implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private double salary;

	public EmployeeApp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	}
}