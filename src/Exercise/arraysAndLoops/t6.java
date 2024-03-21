package Exercise.arraysAndLoops;

public class t6 {
  public static void main(String[] args) {
    //팩토리얼이란 차례대로 곱한 수로, 느낌표를 사용하여 나타냅니다.
    /* 1! = 1 = 1
       2! = 2 x 1 = 2
       3! = 3 x 2 x 1 = 6
       4! = 4 x 3 x 2 x 1 = 24 */
    // 출력 예와 같은 결과를 얻도록 printFactorial()메소드를 완성하고, 적정한 입력값을 넣으시오.
    // 4! = 4 x 3 x 2 x 1 = 24

    int num = 4;

    printFactorial(num);
  }

  private static void printFactorial(int n) {
    int result = 1;
    System.out.printf("%d! =", n);
    for (int i = n; i > 0; i--) {
      System.out.printf(" %d", i);
      result *= i;

      if (i != 1) {
        System.out.printf(" x ");
      }
    }
    System.out.printf(" = %d%n",result);
  }
}
