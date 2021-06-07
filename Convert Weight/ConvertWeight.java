//This program converts pounds into kilograms

import java.util.Scanner;

public class ConvertWeight {
	private final static double KILOGRAMS_PER_POUND = 0.453592;

	public static void main(String[] args) {
		System.out.println();
		System.out.println("This program converts pounds into kilograms");

		System.out.println("\nPlease enter name:");

		Scanner inFile;
		inFile = new Scanner(System.in);
		String name = inFile.nextLine();

		System.out.println("\nEnter weight in pounds:");

		double weightInPounds = inFile.nextDouble();

		double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		System.out.println("\n******************************************");
		System.out.println("\t" + name + ", the weight is " + weightInKilograms + "kilograms");
	}
}