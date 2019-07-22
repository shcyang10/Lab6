package co.grandcircus;

import java.util.Scanner;

public class Lab6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char userChar;
		userChar = 'y';
		int sides;
		int random = 1;
		
		do {
		System.out.println("How many sides should each die have?");
		sides = scan.nextInt();
		
		
		System.out.println("Roll " + random);
		
		//System.out.println(firstRoll = generateRandomDieRoll(sides));
		int firstRoll = generateRandomDieRoll(sides);
		int secondRoll = generateRandomDieRoll(sides) + 1;
		
		System.out.println(firstRoll);
		System.out.println(secondRoll);
		
	
		System.out.println("Roll again? (y/n)");
		userChar = scan.next().charAt(0);
		
		}
		
		while (userChar == 'y');
		
		System.out.println("Thank you for playing!!!");
		
		scan.close();
		}
	
	private static int generateRandomDieRoll(int sides) {
		int side = 0;
		side = (int)(Math.random() * sides) + 1;
		return side;
	
		
		
	}

}

