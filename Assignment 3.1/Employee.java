import java.io.*;

public class Employee {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\ftt\\Desktop\\Cdac Notes\\java\\assignments\\employee.txt";
		EmployeeApp[] empArray = {

				new EmployeeApp(101, "Shivam  Soni1", 45000.0),

				new EmployeeApp(102, "Shivam  Soni2", 60000.0),

				new EmployeeApp(103, "Shivam  Soni3", 55000.0) };
		saveEmployees(filePath, empArray);

		loadEmployees(filePath);
	}

	private static void saveEmployees(String filePath, EmployeeApp[] emps) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
			oos.writeObject(emps);
			System.out.println("Employee array successfully saved to file!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadEmployees(String filePath) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
			EmployeeApp[] emps = (EmployeeApp[]) ois.readObject();
			System.out.println("\n--- Loaded Employees from File ---");
			for (EmployeeApp e : emps) {
				System.out.println(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
