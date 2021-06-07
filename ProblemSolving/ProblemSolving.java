//This program shows children possible displays of basic equations. Created by Jaymes Bunce

import java.util.Scanner;

public class ProblemSolving {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("This program will show you the answers to basic equations (+,-,*,/) of two numbers");

		Scanner inFile;
		inFile = new Scanner(System.in);

		System.out.println("\nEnter the first number to calculate: ");
		double firstNumber = inFile.nextDouble();

		System.out.println("\nEnter the second number to calculate: ");
		double secondNumber = inFile.nextDouble();

		double solutionAdd = firstNumber + secondNumber;
		double solutionSub = firstNumber - secondNumber;
		double solutionMul = firstNumber * secondNumber;
		double solutionDiv = firstNumber / secondNumber;

		System.out.println("\nThe answers are:\n" + firstNumber + " + " + secondNumber + " = " + solutionAdd + "\n");
		System.out.println(firstNumber + " - " + secondNumber + " = " + solutionSub + "\n");
		System.out.println(firstNumber + " * " + secondNumber + " = " + solutionMul + "\n");
		System.out.println(firstNumber + " / " + secondNumber + " = " + solutionDiv + "\n");
	
	}
}