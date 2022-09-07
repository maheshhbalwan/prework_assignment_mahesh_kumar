/*
Program to find the 'First Letter' of each word in the String.
*/

import java.util.Scanner;


public class FirstLetterPrinter 
{
	public static void main(String[] args) 
	{
	
	// Take user input in variable str with String data type
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a string with spaces");
		String str = ob.nextLine();
	// Display user input in variable str
		System.out.println("You have entered -"+ str);
	// To split the words in the string
		splitWords(str);
	}

	static void splitWords(String str)
	{
	// Splitting the string and taking each word in the 'words' array
		String words [] = str.split(" ");
		for (int i=0; i<words.length; i++)
		{
			String s= words[i];
	//Displaying the letter at index 0 in each word of the String 
			System.out.print(s.charAt(0));
		}
	}
}

