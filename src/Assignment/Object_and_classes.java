package Assignment;
import java.util.Scanner;

class circle {
    double radius;
}

class rectangle {
    double length, breadth;
}

class triangle {
    double side_A, side_B, side_C;
}

public class Object_and_classes {
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        double pi = 3.14;

        // Circle
        circle Circle = new circle();
        System.out.println("\n>>>CIRCLE<<<");
        System.out.print("enter the radius of the circle : ");
        Circle.radius = scan.nextDouble();
        double area1, parameter1;
        area1 = pi * Circle.radius * Circle.radius;
        parameter1 = 2 * pi * Circle.radius;

        // Rectangle
        rectangle Rectangle = new rectangle();
        System.out.println("\n>>>RECTANGLE<<<");
        System.out.print("enter the length : ");
        Rectangle.length = scan.nextDouble();
        System.out.print("enter the breadth : ");
        Rectangle.breadth = scan.nextDouble();
        double area2, parameter2;
        area2 = Rectangle.length * Rectangle.breadth;
        parameter2 = 2 * (Rectangle.breadth + Rectangle.length);

        // Triangle
        triangle Triangle = new triangle();
        System.out.println("\n>>>TRIANGLE<<<");
        System.out.print("enter the side A : ");
        Triangle.side_A = scan.nextDouble();
        System.out.print("enter the side B : ");
        Triangle.side_B = scan.nextDouble();
        System.out.print("enter the side C : ");
        Triangle.side_B = scan.nextDouble();
        double area3, parameter3;
        area3 = Triangle.side_A * Triangle.side_B / 2;
        parameter3 = Triangle.side_A + Triangle.side_B + Triangle.side_C;

        // Print the output
        System.out.println("\n=====OUTPUT=====");
        System.out.println("\n--Circle--");
        System.out.println("Area = "+area1+"\nParameter = "+parameter1);
        System.out.println("\n--Rectangle--");
        System.out.println("Area = "+area2+"\nParameter = "+parameter2);
        System.out.println("\n--Triangle--");
        System.out.println("Area = "+area3+"\nParameter = "+parameter3);
    }
}
