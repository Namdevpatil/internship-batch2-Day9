package com.javaDefaultAccessModifiers;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		/**
		 * write a java program to print a given character is digit or 
		 * whitespace or alphabet or special character.
		 */
		
		char value;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any character(*(a-z)/(0-9)/(@, #, &..etc)): ");
		value = scanner.next().charAt(0);
		
		while(true)
		{		
			
			System.out.println("the options: ");
			System.out.println("option 1: albhabet");
			System.out.println("option 2: digit ");
			System.out.println("option 3: white space ");
			System.out.println("option 4: to stop the program ");
			
			System.out.println("-------------------------------");
			
			System.out.println("select your option: ");
			int option = scanner.nextInt();
			
			scanner.close();
			
			switch(option)
			{	
				
				case 1:
					if(Character.isLetter(value))
					{
						System.out.println("it is a alphabet");
					}
					else
					{
						System.out.println("it is not a alphabet");
					}
				case 2:
					if(Character.isDigit(value))
					{
						System.out.println("it is a number");
					}
				case 3:
					if(Character.isWhitespace(value))
					{
						System.out.println("it is a white space");
					}
				case 4:
					System.exit(0);
					
				default:
					System.out.println("it is a special character.");
			}
		}	
		
		
		
	}

}
