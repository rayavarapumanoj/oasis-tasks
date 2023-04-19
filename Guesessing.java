import java.util.Scanner;

public class Guesessing 
{
    public static void main(String[] args) 
    {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess;
        int numGuesses = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number in between 1 and 100. ");
        System.out.println( "You have 10 attempts to guess the number.");
        while (numGuesses < 10) 
        {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            numGuesses++;
            if (userGuess == randomNumber) 
            {
            	flag = true;
                break;
            } 
            else if (userGuess < randomNumber)
            {
                System.out.println("Your guess is too low.");
            }  
            else  
            {
                System.out.println("Your guess is too high.");
            }
        }

        if (flag) {
            System.out.println("Congratulations! You guessed the number is correct " + numGuesses + " attempts.");
        }
        else 
        {
            System.out.println("Sorry, you did not guess the number. The number was " + randomNumber + ".");
        }
        sc.close();
    }
}