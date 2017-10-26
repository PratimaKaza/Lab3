import java.util.Scanner;

public class SquaresCubes2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// 1. prompt user for integer input

		System.out.println("Hello World!");

		Scanner scan = new Scanner(System.in);
		String repeat = "";
		// String s = "";
		// int d;

		int userNum = 0;
		do {
			System.out.println("Please enter a whole number.");
			userNum = scan.nextInt();
			System.out.println(userNum);
			System.out.printf("%-10s%-11s%-10s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s%-11s%-10s\n", "======", "=======", "=====");
			// 2. calculate squares and cubes
			/// Start for loop
			for (int i = 1; i <= userNum; i++) {

				int userSquare = i * i;

				int userCube = getCubes(i);

				// scan.nextLine();

				// 3. display a table of squares and cubes

				System.out.printf("%-10d%-11d%-5d\n", i, userSquare, userCube);

			}
			scan.nextLine();
			System.out.println("Do you want to pick another whole numer? y/n");
			repeat = scan.nextLine();
			System.out.println(repeat);

			// 4. question user if want to continue?

		} while (repeat.equalsIgnoreCase("y"));
		scan.close();
	}

	public static int getCubes(int input) {
		int result = (int) Math.pow(input, 3);
		return result;
	}

}
