
public class Member {

	private	String Name;
	private	int Age;
	private	int Phone_Number;
	private	String Address;
	private	int Salary;
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(int phone_Number) {
		Phone_Number = phone_Number;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	void printSalary() {
		System.out.println("Your Salary is : "+"\t"+ Salary);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
			PrimeMembers allInOne = new  PrimeMembers();
		
			System.out.println("Enter Your Name :");
			allInOne.setName(ConsoleInput.getString());
			
			System.out.println("Enter Your age :");
			allInOne.setAge(ConsoleInput.getint());
				
			System.out.println("Enter Your Number :");
			allInOne.setPhone_Number(ConsoleInput.getint());
				
			System.out.println("Enter Your Address :");
			allInOne.setAddress(ConsoleInput.getString());
				
			System.out.println("Enter Your Salary :");
			allInOne.setSalary(ConsoleInput.getint());
				
			System.out.println("Enter Your JoininYear :");
			allInOne.setJoiningYear(ConsoleInput.getint());

			System.out.println("Enter Your JoininFees :");
			allInOne.setJoiningFees(ConsoleInput.getint());
				
//			System.out.println("Is he Active ? :");
			allInOne.setActive(true);
			
				allInOne.display();
	}

}



class PrimeMembers extends Member {
	
	private int JoiningYear;
	private int JoiningFees;
	private boolean isActive;

	public int getJoiningYear() {
		return JoiningYear;
	}
	public void setJoiningYear(int joiningYear) {
		JoiningYear = joiningYear;
	}
	public int getJoiningFees() {
		return JoiningFees;
	}
	public void setJoiningFees(int joiningFees) {
		JoiningFees = joiningFees;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}	
	
	void display() {
		System.out.println("Date Of Joining is : "+"\t"+getJoiningYear());
		System.out.println("Joining Fees is : "+"\t"+getJoiningFees());
		System.out.println("Is Active: "+"\t"+isActive());

		System.out.println("Name is : "+"\t"+getName());
		System.out.println("Age is : "+"\t"+getAge());
		System.out.println("Phone Number is : "+"\t"+getPhone_Number());
		System.out.println("Address is : "+"\t"+getAddress());
		System.out.println("Salary is : "+"\t"+getSalary());
	}
	}