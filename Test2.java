package week3;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    private static Random num = new Random();
    private static int answer = 0;
    private static int guess;
    private static String playAgain;

    public static void main(String[] args) {
        inputGuess();
    }

    // Guess Method.
    public static void inputGuess(){
        // create answer.
        answer = 1+ num.nextInt(10);

        System.out.println("Enter a number between 1 and 10 as your first guess: ");
        Scanner input = new Scanner(System.in);
        guess = input.nextInt();
        do{
            if (guess < 1 || guess > 10){
                System.out.println("That is not a valid entry. Please try again: ");
                guess = input.nextInt();
            }else if (guess > answer){
                System.out.println("Too high, Try Again: ");
                guess = input.nextInt();
            }else if (guess < answer){
                System.out.println("Too low, Try Again: ");
                guess = input.nextInt();
            }

        }while (guess != answer);

        System.out.println("Congratulations, You guessed the number!");
        System.out.println("Would you like to play again? Enter Y to play or any other key to quit: ");
        playAgain = input.nextLine();
        if( playAgain.equalsIgnoreCase("Y") ){
            inputGuess();
        }

    }
}