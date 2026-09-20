import java.util.*;


class Student implements Comparable<Student>{
	
	int rollNo;
	
	Student(int rollNo){
		this.rollNo = rollNo;
	}
	
	@Override
    public int compareTo(Student o) {
        if (this.rollNo == o.rollNo) return 0;
        else if (this.rollNo > o.rollNo) return 1;
        else return -1;
    }
}

public class Que7 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(103));
		list.add(new Student(104));
		list.add(new Student(105));
		list.add(new Student(101));
		list.add(new Student(102));
		
		Collections.sort(list);
		
		for(Student s : list) {
			System.out.println("Roll Number is : "+s.rollNo);
		}
		
	}
}
