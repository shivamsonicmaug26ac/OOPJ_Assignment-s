
public class Employee {

	String name;
	int yearOfJoining;
	String address;
	
	Employee(String na, int ye, String ad ){
		
		this.name = na;
		this.yearOfJoining = ye;
		this.address = ad;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("shivam1", 2027, "Indore");
		Employee e2 = new Employee("shivam2", 2028, "Indore");
		Employee e3 = new Employee("shivam3", 2029, "Indore");
		
		
		System.out.println("Name \t  Year of joining \t Address");
//================================This is  heading==========================================================		
		System.out.println(e1.name + "\t" +"\t" + e1.yearOfJoining +"\t"+"\t"+ e1.address);
		System.out.println(e2.name + "\t" +"\t" + e2.yearOfJoining +"\t"+"\t"+ e2.address);
		System.out.println(e3.name + "\t" +"\t" + e3.yearOfJoining +"\t"+"\t"+ e3.address);
	}

}
