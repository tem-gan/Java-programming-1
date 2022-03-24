package lab7;

import java.util.Random;
import java.util.Scanner;

public class Birthday {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int nPeople, nReps;
		System.out.print("Enter the no. of people:");
		nPeople = console.nextInt();
		System.out.print("Enter the no. of repetitions:");
		nReps = console.nextInt();
		console.close();
		System.out.println("Experiment1 \nProbability of Hits: ");
		Birthday z = new Birthday();
		z.experiment1(nPeople, nReps);
	}
	int[] oneTrial(int nPeople) {
		
		Random luck = new Random();
		int[] theCounts = new int[nPeople];
		
		for(int i = 0; i<nPeople; i++) {
			theCounts[ i ] = luck.nextInt(365);
			
		}
		return theCounts;
	}
	boolean hasAHit(int[] array) {
		for(int j = 0; j <array.length-1; j++) {
			for(int p=j+1; p<array.length; p++)
			if(array[j]==array[p]) {
				return true;
			}
		}
		return false;
	}
    void experiment1(int nPeople, int nReps) {
		double hitRate=0;
		int n[];
		for(int l=0; l<=nReps; l++) {
			n = this.oneTrial(nPeople);
			if(this.hasAHit(n)) {
				hitRate++;
				
			}
		}
		System.out.printf("%.3f",hitRate/nReps);
	}
    
    }

