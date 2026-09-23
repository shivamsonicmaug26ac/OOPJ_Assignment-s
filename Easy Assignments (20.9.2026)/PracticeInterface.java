interface RegularPolygon {

	int getNumSides();

	double getSideLength();

	
	static int totalSides(RegularPolygon[] polygons) {

		int total = 0;

		for (RegularPolygon polygon : polygons) {
			total = total + polygon.getNumSides();
		}

		return total;
	}

	
	default double getPerimeter() {

		return getNumSides() * getSideLength();
	}

	default double getInteriorAngle() {

		int n = getNumSides();

		return (n - 2) * Math.PI / n;
	}
}

class EquilateralTriangle implements RegularPolygon {

	private double sideLength;

	public EquilateralTriangle(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public int getNumSides() {
		return 3;
	}

	@Override
	public double getSideLength() {
		return sideLength;
	}
}

class Square implements RegularPolygon {

	private double sideLength;

	public Square(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public int getNumSides() {
		return 4;
	}

	@Override
	public double getSideLength() {
		return sideLength;
	}
}

public class PracticeInterface {
	public static void main(String[] args) {
		EquilateralTriangle triangle = new EquilateralTriangle(5.0);
		Square square = new Square(4.0);

		System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
		System.out.println("Square Perimeter: " + square.getPerimeter());
		System.out.println("Triangle Interior Angle: " + triangle.getInteriorAngle());

		RegularPolygon[] shapes = { triangle, square };
		System.out.println("Total Sides: " + RegularPolygon.totalSides(shapes));
	}
}