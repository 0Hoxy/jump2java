package Exercise.ArraysAndLoops;

public class t1 {
  public static void main(String[] args) {
    double start = 72.4;
    int after = 5;
    double result = weight(start, after);
    System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
  }
  public static double weight(double currentWeight, int months) {
    double expectedWeight = currentWeight;
    for (int i = 0; i < months; i++) {
      expectedWeight += 0.231;
    }
    return expectedWeight;
  }
}