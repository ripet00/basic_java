package Assignment.variables_datatype;

public class second_program {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        System.out.println("a = " + a + "\nb = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(">>>>>SWAP<<<<<");
        System.out.println("a = " + a + "\nb = " + b);
    }
}