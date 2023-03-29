import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLow();
    }
    public static int randomNumber() {
        return (int)Math.floor(Math.random() * 100);
    }

    public static void highLow() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = randomNumber();
        System.out.println(randomNumber);
        System.out.println("I'm thinking of a random number between 1 and 100.");

        String continueConfirm;

        do {
            System.out.println("Guess the number correctly and you win. What is your guess?");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Wow! What a guess! You win!");
                break;
            } else if (userGuess > randomNumber) {
                System.out.println("Lower...");
            } else {
                System.out.println("Higher....");
            }

            System.out.println("Would you like to take another shot at it? [y/n]");
            continueConfirm = scanner.next();
            if (continueConfirm.equalsIgnoreCase("n")) {
                System.out.println("That's fine. I'll be around if you want to play again.");
            }
        } while (continueConfirm.equalsIgnoreCase("y"));


    }
}