package OOP.Polymorphysm;

public class Overiding {
    public static void main(String[] args) {
        animal hewan = new animal();
        animal hewan1 = new cat();
        animal hewan2 = new bird();

        hewan.sound();
        hewan1.sound();
        hewan1.food();
        hewan.color();
        hewan2.sound();
    }
}

class animal {
    void sound() {
        System.out.println(">> animal makes a sound <<");
    }
    void food() {
        System.out.println("i want fish\n");
    }
    void color() {
        System.out.println("This animal color is : ");
    }
}

class cat extends animal {
    void sound() {
        System.out.println("Cat : meeoowwww");
    } 
    void food() {
        System.out.println("i want fish\n");
    }
    void color() {
        System.out.println("This animal color is : ");
    }
}

class bird extends animal {
    void sound() {
        System.out.println("bird : chhhiiirrrppp");
    }
    void food() {
        System.out.println("i want fish\n");
    }
    void color() {
        System.out.println("This animal color is : ");
    }
}


