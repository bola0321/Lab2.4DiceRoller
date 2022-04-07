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
		int rollCounter = 0;
		boolean cont = true;

		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		
		do {
			rollCounter+=1;
			System.out.print("\n" + "How many sides should each die have?");
			numSides = scnr.nextInt();
	
			randomRollOne = generateRandomDice(numSides);
			randomRollTwo = generateRandomDice(numSides);
	
			System.out.println(randomRollOne + 1);
			System.out.println(randomRollTwo + 1);
	
			int dieSum = randomRollOne + randomRollTwo;
	
			if (rollCounter == 1)
				if(dieSum == 0 || dieSum == 1 || dieSum == 10) {
				System.out.println("Craps!");
			} else if (randomRollOne == 0 && randomRollTwo == 0) {
				System.out.println("Snake Eyes!");
			} else if (randomRollOne == 5 && randomRollTwo == 5) {
				System.out.println("Boxcars!");
			}
			
			cont = askUserYN("Would you like to roll again (y/n)? ");
			System.out.println(cont);
			
		}while(cont == true);
		
// TODO: insert roll counter logic (roll 1, roll2, roll 3, etc....)
		scnr.close();

	}

		/********************* generateRandomDice **********************
		 * 
		 * @param numSides
		 * @return 
		 */

	public static int generateRandomDice(int numSides) {

		int randomRoll = ((int) (Math.random() * numSides));

		return randomRoll;

	}

		/************************* askUserYN ****************************	
		 * "Would you like to roll again?(y/n): "
		 * @param x
		 * @return
		 */
	public static boolean askUserYN (String x) {
		boolean flag = true;
		System.out.println(x);
		Scanner scnr = new Scanner(System.in);
		String yesNo = scnr.next().trim().toLowerCase();	
		if (yesNo.equals("n")) {
			flag = false;
			System.out.println("\n" + "Thank you for visiting the Grand Circus Casino.");
		}else if(yesNo.equals("y")){
			 flag = true;
		}
		return flag;
		}

	}
