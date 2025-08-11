package day9;

class GenericBox<T> {
	private T length;
	private T breadth;
	private T radius;
	
	public T getlength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getBreadth() {
		return breadth;
	}

	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}
	
	public T getRadius() {
		return radius;
	}
	
	public void setRadius(T radius) {
		this.radius = radius;
	}

}
	
public class GenericAssesment {

	public static void main(String[] args) {
		GenericBox<Integer> intrect = new GenericBox<>();
		intrect.setLength(10);
		intrect.setBreadth(5);
		int arearectangle = intrect.getlength() * intrect.getBreadth();
		System.out.println("Area Of Rectangle is : "+arearectangle);
		
		GenericBox<Double> doublecircle = new GenericBox<>();
		doublecircle.setRadius(10.0);
		double areacircle = 3.14f * doublecircle.getRadius() * doublecircle.getRadius();
		System.out.println("Area Of Circle is : "+areacircle);
		
		
	}

}
