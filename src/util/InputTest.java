package util;
import util.Input;
import shapes.Circle;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String userString = input.getString();
        System.out.println("Your string is: " + userString);

        boolean userBool = input.yesNo();
        System.out.println("That equals " + userBool);

        int userMinMaxInt = input.getInt(1,10);
        System.out.println("You have entered: " + userMinMaxInt);

        double myDouble = input.getDouble(1, 10);
        System.out.println("You have entered: " + myDouble);
    }
}
