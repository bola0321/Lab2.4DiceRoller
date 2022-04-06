import java.util.Scanner;

public class diceRoller {

	public static void main(String[] args) {
		// ask user for how many sides of dice
		// prompt user to roll dice
		// roll two dice of user selection size
		// ask user to if the want to roll the dice again
		
		//TODO: insert roll counter logic (roll 1, roll2, roll 3, etc....)
		//TODO: Write generateRandomDieRoll method
		int numSides;
		int generateRandomDieRoll;
		int randomRollOne;
		int randomRollTwo;
		int rollCounter;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.print("\n" + "How many sides should each die have?");
		numSides = scnr.nextInt();
		
		randomRollOne = ((int) (Math.random()*numSides) );
		randomRollTwo = ((int) (Math.random()*numSides) );
		System.out.println(randomRollOne + 1);
		System.out.println(randomRollTwo + 1);
		
		int dieSum = randomRollOne + randomRollTwo;
		
		if(dieSum == 2 || dieSum == 3 || dieSum == 12) {
			System.out.println("Craps!");
		}else if (randomRollOne == 0 && randomRollTwo == 0) {
			System.out.println("Snake Eyes!");
		}else if (randomRollOne == 5 && randomRollTwo == 5) {
			System.out.println("Boxcars!");
		}
		
		// TODO: Roll n counter
	}

//	public static int randomDice(int numSides) {
//		
//	}

//****************** generateRandomDieRoll **************	
	// public static void generateRandomDieRoll() {

	// }

}