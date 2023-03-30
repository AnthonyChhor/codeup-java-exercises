package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);



    public String getString(String input) {
        System.out.println(input);
        return scanner.nextLine();
    }

    public String getString() {
        System.out.println("Enter a string");
        return scanner.nextLine();
    }

    public String yesNo(String input) {
        System.out.println(input);
//        String number = scanner.next();
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter [y/n].");
        String number = scanner.nextLine();
        return number.equalsIgnoreCase("y") || number.equalsIgnoreCase("yes");
    }


    public int getInt(int min, int max, String input) {
        int userInput = 0;
        do{
            System.out.println(input);
            userInput = validInt();
        }while (userInput > max || userInput < min);

        return userInput;
    }

    public int getInt(int min, int max) {
        int userInput = 0;

        do{
            System.out.printf("Please enter an integer between %s and %s %n", min, max);
            userInput = validInt();
        }while (userInput > max || userInput < min);

        return userInput;
    }

    public int getInt(String input) {
        System.out.println(input);
        return validInt();
    }

    public int getInt() {
        return validInt();
    }

    public int validInt() {
        boolean isInt = false;
        int userInt = 0;

        while (!isInt) {
            if (scanner.hasNextInt()) {
                userInt = scanner.nextInt();
                isInt = true;
            } else {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }
        return userInt;
    }


    public double getDouble(double min, double max, String input) {
        double userInput = 0;
        do{
            System.out.println(input);
            userInput = inputDouble();
        }while (userInput > max || userInput < min);

        return userInput;
    }

    public double getDouble(double min, double max) {
        double userInput = 0;
        do{
            System.out.printf("Please enter a double between %s and %s \n", min, max);
            userInput = inputDouble();
        }while (userInput > max || userInput < min);

        return userInput;
    }

    public double getDouble(String input) {
        System.out.println(input);
        return inputDouble();
    }

    public double getDouble() {
        return inputDouble();
    }

    public double inputDouble() {
        boolean isDouble = false;
        double userDouble = 0;

        while (!isDouble) {
            if (scanner.hasNextDouble()) {
                userDouble = scanner.nextDouble();
                isDouble = true;
            } else {
                System.out.println("Please enter a double");
                scanner.next();
            }
        }
        return userDouble;
    }


}
