package Exercise.arraysAndLoops;

public class t8_re {

  /*자바 프로그래밍 시험에서 B+ 학점을 넘기면 장학금을 탈 수 있게 된 Kate(21) 학생.
      과연 장학금의 행방은 어디로!?
      아래 성적표 중 최고 득점자를 찾으려 한다. 이를 위한 메소드 topIndex()를 완성하고,
      출력 예와 같은 결과를 얻으시오.
      Elena 65점 Suzie 74점 John 23점 Emily 75점 Neda 68점 Kate 96점 Alex 88점 Daniel 98점 Hamilton 54점

      출력 예
      1등: Daniel(98점)   */
  public static void main(String[] args) {
    String[] student = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
    int[] score = {65, 74, 23, 75, 68, 96, 88, 98, 54};
    int topIndex = topIndex(score);
    System.out.printf("1등: %s(%d점)", student[topIndex], score[topIndex]);
  }

  //정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
  private static int topIndex(int[] scores) {
    int best = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > scores[best]) {
        best = i;
      }
    }
    return best;
  }
}