
public class Rectangle {
	
	int length;
	int breadth;
	int area;
	Rectangle(int le, int br){
		length = le;
		breadth = br;
	}
	
	int area(){
		this.area = length*breadth;
		return area;
	}

	int perimeter(){
		return 2*(length+breadth);
	}

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(6,8);
		
		System.out.println("This is the area :" + r.area());
		System.out.println("This is the area :" + r.perimeter());
		
		Square r1 = new Square(6);
		
		System.out.println("This is the Square :" + r1.area());
		System.out.println("This is the Square:" + r1.perimeter());
	}

}

class Square extends Rectangle
{
Square (int side){
	
	super(side,side);
	
}
}
