package shapes;
import java.util.Scanner;
import util.Input;
import util.InputTest;
public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }



    public double getCircumference() {
        return Math.PI * 2 * this.radius;
    }



}
