package Exercise.Method;

public class ex3 {
  public static void main(String[] args) {
    int person = 180;
    double onegram = 5.179;
    int n3 = 3;
    double result = calories(n3);
    System.out.printf("삼겹살 %d인분: %.2f kcal",n3,result);
  }

  private static double calories(int n3){
    return n3*180*5.179;
  }
}
