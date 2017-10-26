/******@author pratimakaza*******/
/**************Lab3: getting squares and cubes into a table*****************/

import java.util.Scanner;

public class SquaresCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. prompt user for integer input

		System.out.println("Hello World!");

		Scanner scan = new Scanner(System.in);
		/******** Variables *********/
		int userNum = 0;
		String repeat = "";

		do {                                  // do-while loop for user continuation question
			System.out.println("Please enter a whole number."); // user input
			userNum = scan.nextInt();
			System.out.printf("%-10s%-11s%-10s\n", "Number", "Squared", "Cubed"); // table print format for Strings
			System.out.printf("%-10s%-11s%-10s\n", "======", "=======", "====="); // table print format for Strings
		/******* 2. calculate squares and cubes********/
			/// Start for loop
			for (int i = 1; i <= userNum; i++) {

				int userSquare = i * i;
				int userCube = getCubes(i);                       // Brings in getCubes method
		/*******3. display a table of squares and cubes******/
				System.out.printf("%-10d%-11d%-5d\n", i, userSquare, userCube); // table print format for Integers

			}

		/******4. question user if want to continue?********/
			scan.nextLine();
			System.out.println("Do you want to pick another whole numer? y/n");
			repeat = scan.nextLine();

		} while (repeat.equalsIgnoreCase("y"));

		scan.close();
	}

	/***** method for calculating cube *****/
	public static int getCubes(int input) {
		int result = (int) Math.pow(input, 3);
		return result;
	}

}
