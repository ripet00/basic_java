package constructors;
import java.io.*;

public class constructor_parameterized {
    public class Geek {
        String name;
        int id;

        Geek(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

    public class GFG {
        public static void main(String[] args) {
            Geek geek1 = new Geek("Rifat",68);
            System.out.println("Geek Name : "+geek1.name + " and GeekId :"+ geek1.id);
        }
    }
}

