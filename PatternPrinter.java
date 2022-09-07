// Patter Printer
/*
Example - Pattern for user input 4
4444333322221111
444333222111
44332211
4321
*/

import java.util.Scanner;

class PatternPrinter {
	public static void	main(String[] args){
		Scanner ob = new Scanner(System.in);
		int userInputNumber = ob.nextInt();
		System.out.println("Your have entered " + userInputNumber);
		patternPrinter(userInputNumber);
	}
	static void patternPrinter(int userInputNumber){


		for (int i=userInputNumber; i>0; i--)
		{
			for (int j=userInputNumber; j>0; j--)
			{
				for (int k=1; k<=i;k++)
				{
					System.out.print(j);
				}
			}
			// To print the next set of line in new line
			System.out.println();
		}

	}
}