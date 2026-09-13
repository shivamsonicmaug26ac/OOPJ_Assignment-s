public class Triangle{
	int a, b, c;
	
		Triangle(int a,int b,int c){
		
		
		this.a=a;
		this.b=b;
		this.c=c;
	}
		
//		method for area
		
	int area() {
		
		return a*b/2;
		
	}
	
//	perimeter of a triangle 
	int perimeter() {
		
		return a+b+c;
		
	}
		public static void main(String[] args) {
			
			Triangle s2 = new Triangle(3,4,5);
			
			s2.area();
			s2.perimeter();
			
			System.out.println("Your Area is : "+s2.area());
			System.out.println("Your Perimeter is : "+s2.perimeter());
			
		}
	
}
