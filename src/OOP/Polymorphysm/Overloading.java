package OOP.Polymorphysm;

public class Overloading {
    public static void main(String[] args) {
        Shape myshape = new Shape();

        myshape.area();
        myshape.area(10);
        myshape.area(3.0 , 4.0);
        myshape.area(5, 4);    
        myshape.area(20.0, 15.0, 4);
    }
}

class Shape {
    public void area() {
        System.out.println("Finde area ");
    }

    public void area(int r) {
        System.out.println("Circle area = "+3.14*r*r);
    }

    public void area(double b, double h) {
        System.out.println("Triangle area = "+0.5 * b * h);
    }

    public void area(int l, int b) {
        System.out.println("Rectangle area = "+ l + b);
    }

    public void area(double x, double y, double z) {
        System.out.println("Trapesium area = "+(x + y)/2*z);
    }
}