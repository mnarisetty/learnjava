import java.util.Scanner;

public class CalculatorRunner {

	void start() {
		boolean quit = false;
		do {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter 1 to add, 2 to subtract, 3 to multiply, 4 to divide, or 5 to quit.");
			int calcCommand = s1.nextInt();

			Scanner s2 = new Scanner(System.in);
			System.out.println("Please enter first integer : ");
			int userInt1 = s2.nextInt();

			Scanner s3 = new Scanner(System.in);
			System.out.println("Please enter second integer : ");
			int userInt2 = s3.nextInt();

			if (calcCommand == 5) {
				quit = true;
				System.out.println("Quitting program.");
			} else {
				try { 
				run(calcCommand, userInt1, userInt2);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		} while (quit == false);
	}

	private void run(int calcCommand, int userInt1, int userInt2) {
		
		

		if (calcCommand == 1) {
			int sum = Math.add(userInt1, userInt2);
			System.out.println(sum);
		}

		else if (calcCommand == 2) {
			int difference = Math.sub(userInt1, userInt2);
			System.out.println(difference);
		}

		else if (calcCommand == 3) {
			int product = Math.multiply(userInt1, userInt2);
			System.out.println(product);
		}

		else if (calcCommand == 4) {
			int quotient = Math.divide(userInt1, userInt2);
			System.out.println(quotient);
		}

		else {
			System.out.println("Invalid output, please enter an integer from 1 - 4.");
		}

	}

}
