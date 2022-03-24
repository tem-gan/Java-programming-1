package lab6;

import java.util.Scanner;

public class Factoring {
	
	
	public static void main(String[] args) {
		
		long theQuotient, theDivisor;
	    Scanner console= new Scanner(System.in);
	       System.out.print("Enter a number >=2: ");
	       theQuotient = console.nextLong();
	       theDivisor = 2;
	       console.close();
	       System.out.print(theQuotient + "= ");
	       while(theQuotient >= 2)
	       {
	              while(theQuotient % theDivisor == 0) 
	              {
	                     System.out.print(theDivisor);
	                     
	                     theQuotient = theQuotient / theDivisor;
	              }
	              
	              theDivisor++;
	       }
	      
	       System.out.print(" * ");
	      
	}
	}
	 