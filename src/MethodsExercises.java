import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(3, 4));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(5, 5));
        System.out.println(division(20, 4));
        System.out.println(modulus(10, 2));

        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Your input: " + userInput);


        Scanner input = new Scanner(System.in);

        while (true) {
            int num;
            long factorial = 1;

            while (true) {
                System.out.print("Enter an integer between 1 and 10: ");
                num = input.nextInt();
                if (num < 1 || num > 10) {
                    System.out.println("Invalid input. Please try again.");
                } else {
                    break;
                }
            }

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.printf("The factorial of %d is %d\n", num, factorial);

            while (true) {
                System.out.print("Do you want to continue? (y/n): ");
                String choice = input.next();
                if (choice.equals("y")) {
                    break;
                } else if (choice.equals("n")) {
                    input.close();
                    System.exit(0);
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }


            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of sides for a pair of dice: ");
            int numSides = scanner.nextInt();

            do {
                int roll1 = rollDice(numSides);
                int roll2 = rollDice(numSides);

                System.out.println("Roll 1: " + roll1);
                System.out.println("Roll 2: " + roll2);

                System.out.print("Roll again? (y/n): ");
            } while (scanner.next().equalsIgnoreCase("y"));

            System.out.println("Thanks for playing!");

        }
    }


    public static int rollDice(int numSides) {
        return (int) (Math.random() * numSides) + 1;
    }


    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++) {
            result += x;
        }
        return result;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            input = scanner.nextInt();

            if (input < min || input > max) {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
            }
        } while (input < min || input > max);

        return input;
    }


}
