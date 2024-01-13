package FlowControl_ForLooping;

public class Main2 {
  public static void main(String[] args) {
    // Sum of first hundred natural numbers is
    int sum = 0;

    for (int i = 1; i <=100; i++) {
      sum += i;
    }

    System.out.println("Sum of first hundred natural number is " + sum);
  }
}
