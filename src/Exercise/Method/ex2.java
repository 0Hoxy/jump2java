package Exercise.Method;

public class ex2 {
  public static void main(String[] args) {
    int walk = 5000;
    double result = calculateCalory(walk);
    System.out.printf("소모 칼로리: %.1fkcal",result);
  }

  private static double calculateCalory(int walk) {
    return 0.02 * walk;
  }
}


