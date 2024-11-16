package L6;

import java.util.Scanner; // Importing the Scanner class for user input

public class IfTest2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the answer
        System.out.print("What is the answer? ");
        
        // Read the user's input and store it in the variable 'answer'
        int answer = input.nextInt();
        
        // Check if the answer is 42 and handle it
        if(answer == 42) {
            System.out.println("You've found the answer!");
        } else {
            System.out.println("Keep looking.");
        }
        
        // Print a message indicating the end of the program
        System.out.println("This is the end.");
    }
}
