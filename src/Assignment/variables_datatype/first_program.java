package Assignment.variables_datatype;

public class first_program {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c;

        System.out.println("a = "+a+"\nb = "+b);
        c = a;
        a = b;
        b = c;
        System.out.println(">>>>>SWAP<<<<<");
        System.out.println("a = "+a+"\nb = "+b);

    }
}
