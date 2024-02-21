package calculator;

public class operator {
    public int penjumlahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        return a / b;
    }
    public int longdivision(int a, int b) {
        return Math.floorDiv(a, b);
    }
    public int modulo(int a, int b) {
        return a % b;
    }
}
