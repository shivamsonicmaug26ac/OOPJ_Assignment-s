
public class Rectangle {

	int length;
	int breadth;
	int area;
	
	Rectangle(int a, int b){
		length = a;
		breadth = b;
	}
	
	int area(){
this.area = length*breadth;
return area;
	}
	
	public static void main(String[] args) {
			
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		
		r1.area();
		r2.area();
		
		System.out.println("The R1 area of rectangle :"+ r1.area());
		System.out.println("The R2 area of rectangle :"+ r2.area());

	}

}
