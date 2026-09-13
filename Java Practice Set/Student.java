
public class Student {
//	for the 1st one

	String name;
	int roll_no;
	String phone_no;
	String address;
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name = "John";
		s1.roll_no = 2;
		s1.phone_no = "12345691";
		s1.address = "Indore";

		System.out.println("Your Name is : "+s1.name);
		System.out.println("Your Roll Number is : "+s1.roll_no);
		System.out.println("Your Phone Number is : "+s1.phone_no);
		System.out.println("Your Address is : "+s1.address);
		
		
		
	}

}

