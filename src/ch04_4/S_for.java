package ch04_4;

public class S_for {
  public static void main(String[] args) {
    String[] numbers = {"1", "2", "3"};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    int[] mark = {90, 25, 67, 45, 80};
    for (int i = 0; i < mark.length; i++) {
      if (mark[i] >= 60) {
        System.out.println((i + 1) + "번 학생은 합격입니다.");
      } else {
        System.out.println((i + 1) + "번 학생은 불합격입니다.");
      }
    }
  }
}

