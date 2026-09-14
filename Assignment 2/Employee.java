public abstract class Employee {

    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public void setInfo(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;

        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Default age 18 assigned.");
            this.age = 18;
        }

        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public abstract String getEmployeeType();

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Type: " + getEmployeeType());
    }
}
