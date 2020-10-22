package scanner;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = 17;
		int counter = 0;
		boolean found = false;
		System.out.println("Guess a number from 1 to 20. You have 10 tries.");
		int guess = sc.nextInt();
		do {
		if(guess < target)
		{
			counter++;
			System.out.println("The number you guessed is lower than the target");
			guess = sc.nextInt(); 	
			
		}
		else if (guess > target)
		{
			counter++;
			System.out.println("The number you guessed is higher than the target");
			guess = sc.nextInt();
			
		}
		else if (guess == target)
		{
			counter++;
			found=true;
			
		}
		}while(found==false);
		
		switch(counter)
		{
		case 1: 
			System.out.println("17 is the correct answer. You took " + counter + " guess. Star rating: Excellent!");
			break;
		case 2:
			System.out.println("17 is the correct answer. You took " + counter + " guesses. Star rating: Very Good!");
			break;
		case 3:
			System.out.println("17 is the correct answer. You took " + counter + " guesses. Star rating: Good");
			break;
		case 4:
			System.out.println("17 is the correct answer. You took " + counter + " guesses. Star rating: Average");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("17 is the correct answer. You took " + counter + " guesses. Star rating: Below Average");
			break;
		default : System.out.println("Something went wrong!");
			break;
				}
		 sc.close();
	}

}
