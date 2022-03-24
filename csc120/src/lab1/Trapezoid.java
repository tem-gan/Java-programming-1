package lab1;


public class Trapezoid {

	public static void main(String[] args) {
		
		double top, bottom, height;
		top = 10.0;
		bottom = 20.5;
		height = 24.4;
		System.out.print("Top:");	
		System.out.println(top);
		System.out.print("Bottom: ");
		System.out.println(bottom);
		System.out.print("height:");
		System.out.println(height);
		System.out.println("Area: "+ (bottom + top) * height / 2);
	}
}
