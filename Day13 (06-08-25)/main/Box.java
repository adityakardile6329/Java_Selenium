package main;

public class Box {
	public double areaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}

	public double areaOfTriangle(double base, double height) {
		return 0.5 * base * height;
	}

	public int areaOfSquare(int side) {
		return side * side;
	}

	public int areaOfRectangle(int length, int width) {
		return length * width;
	}

	public double simpleInterest(double p, double r, double t) {
		return (p * r * t) / 100;
	}

	public double amount(double p, double r, double t) {
	    double si = simpleInterest(p, r, t);
	    return p + si;
	}
}
