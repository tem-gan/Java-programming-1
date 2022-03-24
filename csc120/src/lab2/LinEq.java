package lab2;
import java.util.Scanner;

public class LinEq {
	
	public static void main(String[] args) {
		
		double a,b,c,d,e,f,h,x,y;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter coefficients for the first equation: ");
		a = console.nextDouble();
		b = console.nextDouble();
		e = console.nextDouble();
		System.out.print("Enter coefficients for the second equation: ");
		c = console.nextDouble();
		d = console.nextDouble();
		f = console.nextDouble();
		console.close();
		h = a * d - b * c;
		x = ( d * e - b * f ) / h;
		y = ( a * f - c * e ) / h;
		System.out.println("The solution is x = " + x + ", y = " + y);
		
	}

}
