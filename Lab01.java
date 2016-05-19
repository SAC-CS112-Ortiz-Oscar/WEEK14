// Week 14 - Main

import java.util.Scanner;

public class Lab01 
{
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		boolean running = true;
		Dice dice1 = new Dice();
		Card card1 = new Card();
		
		int ARRAY_SIZE = 10;
		int[] randomNumbers = new int[ARRAY_SIZE];
		int[] cards = new int[ARRAY_SIZE];
		
		int count = 0;
		int index = 0;
		
		while(running)
		{
			count++;
			
			int number = dice1.getRandomNumber();
			randomNumbers[index++] = number;
			System.out.println("A dice was rolled. \nThe result is: " + number);
			
			System.out.println("\nThe dice has been rolled " + dice1.getHistory() + " times.\n");
			
			int card = card1.getRandomNumber();
			cards[index++] = card;
			
			System.out.println("A card was drawn from a 52 card deck. \nThe card is: " + card + ".\n");
			
			System.out.println("\nA card has been drawn " + card1.getHistory() + " times.");
			
			if( count == (ARRAY_SIZE -1))
			{
				System.out.println("Game over.");
				running = false;
			}
			System.out.println("\nPress 1 to try again or any other key to exit: ");
			int again = input.nextInt();
			if(again != 1) break;
		}
		
		System.out.println("\nThe history of dice rolls is: ");
		for(int printIndex = 0; printIndex < count; printIndex++)
		{
			System.out.println( randomNumbers[printIndex]);
		}
		
		System.out.println("\nThe history of cards is: ");
		for(int printIndex = 0; printIndex < count; printIndex++)
		{
			System.out.println( cards[printIndex]);
		}
		System.out.println("\nGoodbye!");
	}
}
