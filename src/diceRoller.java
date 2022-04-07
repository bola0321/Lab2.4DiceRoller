import java.util.Scanner;

public class diceRoller {

	public static void main(String[] args) {
		// ask user for how many sides of dice
		// prompt user to roll dice
		// roll two dice of user selection size
		// ask user to if the want to roll the dice again

		int numSides;
		int randomRollOne;
		int randomRollTwo;
		int rollCounter;

		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.print("\n" + "How many sides should each die have?");
		numSides = scnr.nextInt();

		randomRollOne = generateRandomDice(numSides);
		randomRollTwo = generateRandomDice(numSides);

		System.out.println(randomRollOne + 1);
		System.out.println(randomRollTwo + 1);

		int dieSum = randomRollOne + randomRollTwo;

		if (dieSum == 2 || dieSum == 3 || dieSum == 12) {
			System.out.println("Craps!");
		} else if (randomRollOne == 0 && randomRollTwo == 0) {
			System.out.println("Snake Eyes!");
		} else if (randomRollOne == 5 && randomRollTwo == 5) {
			System.out.println("Boxcars!");
		}

// TODO: insert roll counter logic (roll 1, roll2, roll 3, etc....)
		scnr.close();

	}

	/********************* generateRandomDice ********************** 
	 * passes in int and randomly chooses number, returns an int
	 */

	public static int generateRandomDice(int numSides) {

		int randomRoll = ((int) (Math.random() * numSides));

		return randomRoll;

//	}

//****************** generateRandomDieRoll **************	
		// public static void generateRandomDieRoll() {

		// }

	}
}