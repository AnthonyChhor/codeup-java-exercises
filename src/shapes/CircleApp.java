package shapes;
import java.util.Scanner;
import util.InputTest;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();

        System.out.println("Enter your radius: ");
        float userRadius = scanner.nextInt();

        Circle circle = new Circle(userRadius);

        System.out.printf("The area of your circle is %.2f.\n", circle.getArea());
        System.out.printf("The circumference of your circle is %.2f.", circle.getCircumference());

    }
}
