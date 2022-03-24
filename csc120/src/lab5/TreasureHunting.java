package lab5;

import java.util.Random;
import java.util.Scanner;

public class TreasureHunting {
	static int prevX, prevY, nowX, nowY, trueX, trueY;
	
	
	public static void main(String[] args) {
		System.out.println("#######################################################\n" + 
				"# A treasure has been hidden at a location in a 10x10 #\n" + 
				"# gird. Guess where it is. You have 10 chances.       #\n" + 
				"#######################################################");
		nowX = -1;
		nowY = -1;
		
		Random luck = new Random();
		trueX = luck.nextInt(10)+1;
		trueY = luck.nextInt(10)+1;
		Scanner console = new Scanner(System.in);
		
		
		for(int i=1; i <= 10 ; i++) {
			if(trueX != nowX ||trueY != nowY) {
				System.out.println("---- Round " + i + " ----");
				if(i>=2) {
					show();
					if(nowX!=trueX || nowY!=trueY) {
						advise();
					}
					
					
				}if(i==10) {
					System.out.println("You have lost the treasure!");
					System.out.println("Treasure was at ("+trueX+","+trueY+")");
					console.close();
					return;
				}
				
				System.out.println("Enter you guess X, Y: ");
				prevX=nowX;
				prevY=nowY;
				nowX= console.nextInt();
				nowY= console.nextInt();
				checkDistance();
			}else {
				System.out.println("You have found the treasure!");
				System.out.println("Treasure was at ("+trueX+","+trueY+")");
				console.close();
				return;
				}
				
				
			}
			
		}
		
	
	public static void show() {
		
		for(int j=1; j<=10;j++) {
			for(int l=1; l<=10; l++) {
				if(j==nowX && l ==nowY) {
					System.out.print("@");
					
				}else if (j==prevX && l==prevY) {
					System.out.print("P");
					
				}else {
				System.out.print(".");
				}	
			}
			System.out.println(j);
		}
		System.out.println("@ = current, P = previous");
	}
	public static void checkDistance() {
		final int CLOSE = 3;
		final int FAR = 6;
		
		int A = Math.abs(nowX-trueX);
		int B = Math.abs(nowY-trueY);
		int MD = A + B;
		
		if(MD == 0) {
			return;
		}else if(MD!=0&&MD<=CLOSE) {
			System.out.println("The distance is no more than 3.");
		}else if(MD>3&&MD<=FAR) {
			System.out.println("The distance is no more than 6.");
		}else if(MD>=7) {
			System.out.println("The distance is more than 6.");
		}
	}
	public static void advise() {
		int C = Math.abs(prevX-trueX);
		int D = Math.abs(prevY-trueY);
		int PD = C+D;
		int A = Math.abs(nowX-trueX);
		int B = Math.abs(nowY-trueY);
		int MD = A + B;
		int dif = MD - PD;
		
		if(dif==0) {
			System.out.println("The same distance");
		}else if(dif>=1) {
			System.out.println("You are farther");
		}else if(dif<=-1) {
			System.out.println("You are closer");
		}
		
		
	}
}