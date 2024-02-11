package Method_Overloading;

public class first_example {
    static int plusMethodfInt(int x, int y) {
        return x + y;
    }


    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodfInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int = "+myNum1);
        System.out.println("double = "+myNum2);
    }
}
