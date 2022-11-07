package com.teksystems.labs;

import java.util.Scanner;

public class SubtractionQuizLoop {
	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 5; // Number of questions
		Scanner input = new Scanner(System.in);
		String cont = "Y";

		while (true) {
			int correctCount = 0; // Count the number of correct answers
			int count = 0; // Count the number of questions
			long startTime = System.currentTimeMillis();

			while (count < NUMBER_OF_QUESTIONS) {
				// 1. Generate two random single-digit integers
				int number1 = (int) (Math.random() * 10);
				int number2 = (int) (Math.random() * 10);
				// 2. If number1 < number2, swap number1 with number2
				if (number1 < number2) {
					int temp = number1;
					number1 = number2;
					number2 = temp;
				}
				// 3. Prompt the student to answer "What is number1 - number2?"
				System.out.print("What is " + number1 + " - " + number2 + "? ");
				int answer = input.nextInt();
				// 4. Grade the answer and display the result
				if (number1 - number2 == answer) {
					System.out.println("You are correct!\n");
					correctCount++;
				} else
					System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be "
							+ (number1 - number2) + "\n");
				// Increase the count
				count++;

			}
			
			long endTime = System.currentTimeMillis();
			
			System.out.println("Correct Answers: " + correctCount);
			System.out.println("Incorrect Answers: " + (NUMBER_OF_QUESTIONS - correctCount));
			System.out.printf("Score: %.1f", ((double)correctCount/(double)NUMBER_OF_QUESTIONS) * 100);
			System.out.println("%");
			System.out.println("It took you " + (endTime -startTime) / 1000 + "s");
			System.out.print("Would you like to play again? (Y/N/Yes/No) ");
			cont = input.next();
			
			if (!cont.substring(0,1).equalsIgnoreCase("Y")) {
				break;
			}

		}

		input.close();
	}
}
