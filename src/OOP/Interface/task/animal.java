package OOP.Interface.task;

public class animal {
    public static void main(String[] args) {
        
    }
}

interface animal {
    public void eat();

    default void hewan(){
        System.out.println("aku adalah hewan");
    }
}

class harbivora implements animal {
    public void eat() {
        System.out.println("we eat grass, vegetable, organic plants, dll");
    }
    default void namahewan() {
        System.out.println();
    }
}
