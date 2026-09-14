public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Employee Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = ConsoleInput.getint();

            switch (choice) {

            case 1:
                if (count == employees.length) {
                    System.out.println("Employee array is full.");
                    break;
                }

                System.out.println("\nSelect Employee Type:");
                System.out.println("1. Manager");
                System.out.println("2. Engineer");
                System.out.println("3. Salesperson");

                System.out.print("Enter type: ");
                int type = ConsoleInput.getint();

                Employee employee;

                if (type == 1) {
                    employee = new Manager();
                } else if (type == 2) {
                    employee = new Engineer();
                } else if (type == 3) {
                    employee = new Salesperson();
                } else {
                    System.out.println("Invalid employee type.");
                    break;
                }

                System.out.print("Enter ID: ");
                int id = ConsoleInput.getint();

                System.out.print("Enter Name: ");
                String name = ConsoleInput.getString();

                System.out.print("Enter Age: ");
                int age = ConsoleInput.getint();

                System.out.print("Enter Salary: ");
                float salary = ConsoleInput.getfloat();

                employee.setInfo(id, name, age, salary);
                employees[count] = employee;
                count++;

                System.out.println("Employee added successfully.");
                break;

            case 2:
                if (count == 0) {
                    System.out.println("No employees available.");
                } else {
                    System.out.println("\n===== Employee Details =====");
                    for (int i = 0; i < count; i++) {
                        employees[i].display();
                    }
                }
                break;

            case 3:
                if (count < 2) {
                    System.out.println("At least two employees are required for sorting.");
                } else {
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = 0; j < count - 1 - i; j++) {
                            if (employees[j].getSalary() > employees[j + 1].getSalary()) {
                                Employee temp = employees[j];
                                employees[j] = employees[j + 1];
                                employees[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Employees sorted by salary.");
                }
                break;

            case 4:
                System.out.println("Program ended.");
                break;

            default:
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}
