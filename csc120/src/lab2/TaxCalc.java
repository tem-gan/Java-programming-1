package lab2;
import java.util.Scanner;

public class TaxCalc {

	public static void main(String[] args) {
		
		Scanner console;
		console = new Scanner(System.in);
		System.out.print("Enter Household name: ");
		String name = console.next();
		System.out.print("Enter household income: ");
		int income = (int)console.nextDouble();
		System.out.print("Enter number of people in the household: ");
		int people = (int)console.nextDouble();
		System.out.print("Enter educational expenses: ");
		int eexpense = (int)console.nextDouble();
		System.out.print("Enter job related expenses: ");
		int jexpense = (int)console.nextDouble();
		console.close();
		
		int A = 3000*people;
		int B = (int)(eexpense*0.90);
		int C = (int)(jexpense*0.80);
		int D = income-A-B-C;
		int tax = (int)(D*0.20);
		System.out.println("Deduction A: " + A);
		System.out.println("Deduction B: " + B);
		System.out.println("Deduction C: " + C);
		System.out.println("Taxable income: " + D);
		System.out.println("For " + name + ", the tax = " + tax);
	}
}
