package Pertemuan_4_21_Desember_2023;

public class logicgates {
    public static void main(String[] args) {
        int a = 81, b = 37;

        // Quiz 1 (true)
        System.out.println("Quiz 1 : "+((a == 0) ^ !(a>b)));
        
        // Quiz 2 (true)
        System.out.println("Quiz 2: "+ (a > 50 || b>30));
        // quiz 3 (true)
        System.out.println("Quiz 3: "+ (a > 80 && b<40));
        // quiz 4 (false)
        System.out.println("Quiz 4:" + (a == 81 ^ b==37));
        // quiz 5 (true)
        System.out.println("Quiz 5 :"+ !(a<= 80));
        // quiz 6 (true)
        System.out.println("Quiz 6 :"+ ((a>80 && b<40) || !(a==81)));
        
        // quiz 7 (false)
        System.out.println("Quiz 7 :"+ ((a==81 ^ b==37) && (a>50)));

        // quiz 8 (false)
        System.out.println("Quiz 8 :"+ ((a > 80 || b<40) && !(a==81)));

        // quiz 9 (true)
        System.out.println("Quiz 9 :"+ (!(a>80) || b!= 37));

        // quiz 10 (true)
        System.out.println("Quiz 10 :"+ ((a==81 ^ b ==37) || (a<90)));

        // quiz 11 (false)
        System.out.println("Quiz 11 : "+ ((a <=81 ^ b >= 37) || (a>90)));
    }
}
