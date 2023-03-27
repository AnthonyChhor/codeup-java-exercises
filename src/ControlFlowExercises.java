import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }
        int x = 100;
        do {
            System.out.println(x);
            x -= 5;
        } while (x >= -10);

        long num = 2;
        do {
            System.out.println(num);
            num *= num;
        } while (num < 1000000);

        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }

        Scanner scanner = new Scanner(System.in);
        String userChoice;
        do {
            System.out.println("What number would you like to go up to? ");
            int value = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("Number\tSquared\tCubed");
            System.out.println("------\t-------\t------");
            for (int a = 1; a <= value; a++) {
                int square = a * a;
                int cube = a * a * a;
                System.out.printf("%d\t\t| %d\t\t| %d%n", a, square, cube);
            }
            System.out.print("Do you want to continue? (y/n): ");
            userChoice = scanner.next();
        } while (userChoice.equalsIgnoreCase("y"));


        scanner.nextLine();
        String userGrade;
        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int grade = scanner.nextInt();
            if (grade >= 88 && grade <= 100) {
                System.out.println("Letter grade: A. Awesome grade!");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("Letter grade: B. You are Below the best.");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("Letter grade: C. C you at study hall!");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("Letter grade: D. Ds get degrees!");
            } else {
                System.out.println("Letter grade: F. Try again next time!");
            }
            System.out.print("Do you want to continue? (y/n): ");
            userGrade = scanner.next();
        } while (userGrade.equalsIgnoreCase("y"));
        scanner.close();
    }
}





