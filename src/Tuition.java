import java.util.Scanner; // Utility to accept input from user

public class Tuition {
	public static void main(String [] args) {
		
		
		Scanner input = new Scanner(System.in);

		//Variables
		double tuition;
		double rate;
		
		//initial tuition cost
		System.out.print("What is the initial tuition cost?");
		tuition = input.nextDouble();
		
		
		// percentage increase
		System.out.print("What is the percentage increase in tuition each year?");
		rate = input.nextDouble();
		
		rate=rate/100;

	
		// for loop
		double totalcost=0;
		
	    for(int i = 0; i <= 4; i++) {
	    	
	    	totalcost += (tuition * (Math.pow(1+rate,i)));
	    }
		System.out.printf("\nYour total tuition expense is $%.3f", totalcost);		
		
	}

}