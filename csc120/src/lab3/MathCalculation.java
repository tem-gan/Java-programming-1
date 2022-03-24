package lab3;
import java.util.Scanner;

public class MathCalculation {
	
	public static void main(String[] args) {
		
		integralInteractive();
	}
	public static void integralInteractive() {
		
		double a, b, c, d, e;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e: ");
		a = console.nextDouble();
		b = console.nextDouble();
		c = console.nextDouble();
		d = console.nextDouble();
		e = console.nextDouble();
		console.close();
		
		
		a = Math.abs(a);
		b = Math.abs(b);
		c = Math.abs(c);
		d = Math.abs(d);
		e = Math.abs(e);
		
		System.out.println("	a = " + a);
		System.out.println("	b = " + b);
		System.out.println("	c = " + c);
		System.out.println("	d = " + d);
		System.out.println("	e = " + e);
		
		double newD = Math.min(d, e);
		double newE = Math.max(d, e);
		
		double integration = computeH(a,b,c,newE) -  computeH(a,b,c,newD);
		
		System.out.println("integral = " + integration);
		
		
	}
	private static double computeH(double a,double b,double c,double x) {
		
		return (Math.pow(x, a+1)/(a+1)) + (Math.log(x+b)/(x+b)) + (Math.exp(c*x)/c);
		
	}
}
