import java.util.Scanner;

public class Complex {

	int realNumber;
	int imgNumber;
	
	Complex(int a, int b){
		this.realNumber=a;
		this.imgNumber=b;
	}
	Complex sum(Complex other) {
		return new Complex(realNumber + other.realNumber, imgNumber + other.imgNumber);
	}

	Complex diffrence(Complex other) {
		return new Complex(realNumber - other.realNumber, imgNumber - other.imgNumber);
	}

	Complex product(Complex other) {
		return new Complex(
				realNumber * other.realNumber - imgNumber
				, imgNumber * other.imgNumber - realNumber);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter real part of first number");
		int real1 = sc.nextInt();

		System.out.println("Enter imganary part of first number");
		int img1 = sc.nextInt();

		System.out.println("Enter real part of second number");
		int real2 = sc.nextInt();
		
		System.out.println("Enter imganary part of second number");
		int img2 = sc.nextInt();
		
		
//		creating obj
		
		Complex c1 = new Complex(real1, img1);
		Complex c2 = new Complex(real2, img2);
		
		Complex sumResult = c1.sum(c2);
		Complex diffrenceResult = c1.diffrence(c2);
		Complex productResult = c1.product(c2);
		
		System.out.println("Sum = " + sumResult.realNumber + "+" + sumResult.imgNumber + "i");
		System.out.println("Diffrence = " + diffrenceResult.realNumber + "+" + diffrenceResult.imgNumber + "i");
		System.out.println("Sum = " + productResult.realNumber + "+" + productResult.imgNumber + "i");
		
		sc.close();
		
		
	}

}
