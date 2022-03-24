package lab4;
import java.util.Scanner;

public class QuadraticFull {
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		double a, b, c;
		System.out.print("Enter a, b, and c for a x^2 + b x + c: ");
		a = console.nextDouble();
		b = console.nextDouble();
		c = console.nextDouble();
		console.close();
		
		solve(a,b,c);
		
	}
	public static void solve(double a, double b, double c) {
		if(a == 0) {
			System.out.println("Invalid because the coefficient a is 0.");
			return;
		}else if(a < 0) {
			a = -a;
			b = -b;
			c = -c;
		}
		double discriminant = Math.pow(b, 2)- 4 * a * c;
		double denominator = 2 * a;
		double left = -b;
		double right = Math.sqrt(Math.abs(discriminant));
		double i = Math.sqrt(-1);
		
		if(discriminant == 0) {
			System.out.println("There is only one solution:");
			printFraction(left, denominator);
		}else if(discriminant>0) {
			System.out.println("There are two solutions:");
			printFraction(left+right, denominator);
			System.out.print(" and ");
			printFraction(left-right, denominator);
		}else if(discriminant<0) {
			System.out.println("There are two complex solutions:");
			printFraction(left, denominator);
			System.out.print(" +/- ");
			printFraction(right, denominator);
			System.out.print("i");
		}
	}
	public static void printFraction(double top, double bottom) {
		if(isInteger(top)&&isInteger(bottom)) {
			int t = (int) top;
			int b = (int) bottom;
			t = t/GCD.gcd(t,b);
			b = b/GCD.gcd(t,b);
			if(b==1) {
				System.out.print(t);
			}else {
				System.out.print(t);
				System.out.print("/");
				System.out.print(b);
			}
			
		}else {
			System.out.print(top/bottom);
		}
	
	
	}
	public static boolean isInteger(double value) {
		if(Math.floor(value) == value) {
			return true;
		}
		return false;
	}
	
}
