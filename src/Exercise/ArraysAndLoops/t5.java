package Exercise.ArraysAndLoops;

public class t5 {
  public static void main(String[] args) {
    //정수 n을 만드는 3가지 정수의 곱 A,B,C를 출력하려 한다.
    //이를 위한 메소드 printCombos()을 완성하여 출력 예와 같은 결과를 얻으시오.)
    printCombos(10);
  }

  public static void printCombos(int n) {
    int count = 0;
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n; j++) {
        for (int k = 0; k <= n; k++) {
          if (i * j * k == 10) {
            System.out.printf("%d = %d x %d x %d%n", n, i, j, k);
            count++;
          }
        }
      }
    }
  }
}

