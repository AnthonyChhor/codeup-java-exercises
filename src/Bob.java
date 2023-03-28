import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner initiation = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Hey I am Bob, would you like to have a conversation?");
        String userChoice = initiation.nextLine();
        if (userChoice.equalsIgnoreCase("Yes")) {
            System.out.println("What would you like to talk about?");
        }
        while (userChoice.equalsIgnoreCase("yes")) {
            String userInput = input.nextLine();


            if (userChoice.equalsIgnoreCase("Yes")) {

                if (userInput.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (userInput.isEmpty()) {
                    System.out.println("Fine. Be that way!");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userInput.equalsIgnoreCase("bye")) {
                    break;
                } else {
                    System.out.println("Whatever.");
                }
            }

        }
        System.out.println("Okay. I will be here when you want to talk.");
    }
}