package lab9;
import java . util .*;
public class triangle {
	
	
	 
	public static void generate ( int num ) {
		 int len=1;
		 int count =0;
		 
		 while(num-count>0) {
			 for(int j=0; j<len; j++) {
				 System.out.print("*");
				 count++;
			 }
			 
			 len++;
			 System.out.println();
		 }
		 
		 
		 
	}
	public static void main ( String [] args )
	{
	 Scanner keyboard = new Scanner ( System . in ) ;
	 for ( ; ; ){
	 System . out . print ( " Enter number : " ) ;
	 int num = keyboard . nextInt () ;
	 if ( num <= 0 )
	 {
	 break ;
	 }
	 generate ( num ) ;
	 }
	 }
	 }

