import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pie is approximately %s.\n", pi);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("what is your favorite number?\n");
        int myUserInt = myScanner.nextInt();
        System.out.printf("Your favorite integer is %s. \n", myUserInt);

        myScanner.nextLine();

        System.out.println("Please enter three words.");
        String userThreeWords = myScanner.nextLine();
        System.out.printf("here are you three words: %s\n", userThreeWords);

        myScanner.nextLine();

        System.out.println("Enter a sentence!");
        String userSentence = myScanner.nextLine();
        System.out.printf("%s\n", userSentence);

        myScanner.nextLine();

        System.out.print("What is the length?\n");
        int roomLength = Integer.parseInt(myScanner.nextLine());

        myScanner.nextLine();

        System.out.print("What is the width?\n");
        int roomWidth = Integer.parseInt(myScanner.nextLine());

        System.out.print("The area of the room is ");
        System.out.println(String.valueOf(roomWidth * roomLength));
        System.out.print("The perimeter of the room is ");
        System.out.println(String.valueOf((roomWidth * 2) + (roomLength * 2)));

    }
}
