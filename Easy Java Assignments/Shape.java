
public class Shape {
	
	void print(){
		System.out.println("This is shape");
	}
	
	

	public static void main(String[] args) {
		
//		main method
		
		Squaree s = new Squaree();
		s.print();
		s.pprint();
		
	}

}


class Rectanglee extends Shape{
	
void pprint(){
		
		System.out.println("This is Rectangle");
	}
	
}
class Circle extends Shape{
	void ppprint(){
		
		System.out.println("This is Circle");
	}
	
}

class Squaree extends Rectanglee{
	void print() {
System.out.println("Square is a rectangle");

pprint();
super.print();
	}
}