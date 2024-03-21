package Exercise.Method;

public class ex7 {
  public static void main(String[] args) {
    /*프로그래밍 수업의 학점은 아래와 같은 기준으로 결정됩니다.
    A+: 95점 이상
    A0: 90점 이상
    B+: 80점 이상
    B0: 70점 이상
    C+: 그 외
    메소드 grade()를 완성하여, 출력 예와 같은 결과를 얻으시오.
     */
    int score1 = 96;
    int score2 = 85;
    int score3 = 76;
    System.out.printf("%d점 -> %s%n", score1, grade(score1));
    System.out.printf("%d점 -> %s%n", score2, grade(score2));
    System.out.printf("%d점 -> %s%n", score3, grade(score3));
  }

  private static String grade(int score) {
    if (score >= 95) {
      return "A+";
    } else if (score >= 90) {
      return "A0";
    } else if (score >= 80) {
      return "B+";
    } else if (score >= 70) {
      return "B0";
    } else {
      return "C+";
    }
  }
}



