import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Generate a random number
        Random random = new Random();
        int answer = random.nextInt(100);

        //number of trials
        int trials = 5;

        //
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking a number between 1 to 100.");
        System.out.println("You have 5 tries to guess the number.");
        boolean correct = false;

        while(trials > 0){
            System.out.print("Enter your guess : ");
            int guess = in.nextInt();

            //user guessed correctly
            if(guess == answer){
                System.out.println("You guessed the Number \n You Win !");
                break;
            }

            //user guess greater than number
            else if (guess > answer) {
                System.out.println("Your guess is too high.");
                System.out.println("You have " + (trials - 1) + " tries left.");

            }

            //user guess less than
            else{
                System.out.println("Your guess is too less.");
                System.out.println("You have " + (trials - 1) + " tries left.");
            }
                trials--;
        }
        if (correct == false) {
            System.out.println("You ran out of tries.\nYou lose!");
            System.out.println("The Correct Number is : " + answer);
        }
    }
}