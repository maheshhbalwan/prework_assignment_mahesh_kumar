// Missing Number Finder

import java.util.Scanner;
class MissingNumberFinder {
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        // Prints message for user input for array size
        System.out.println("Enter the size of the array");
        
        // User input
        int userInputSize = ob.nextInt();
        // Prints the size of the array
        System.out.println("The size of the array is "+ userInputSize);
        // Prints message for user input for array elements
        System.out.println("Enter the array elements below");
        // Takes input from the user for a number less than the total size of the array
        int[] arr = new int[userInputSize - 1];
        for (int i = 0; i < userInputSize - 1; i++) arr[i] = ob .nextInt();

        int n = arr.length + 1;
        int sum = (n*(n+1))/2;

        for (int i =0; i < arr.length; i++){
            sum= sum- arr[i]; 
        } 
        System.out.println("Missing number is " + sum);
    }
} 
