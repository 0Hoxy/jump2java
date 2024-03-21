package ch04_4;

public class S_forContinue {
  public static void main(String[] args) {
    int[] mark = {90, 25, 67, 45, 80};
    for (int i = 0; i < mark.length; i++) {
      if (mark[i] < 60) {
        continue;
      }
      System.out.println((i + 1)+"번 학생 축하합니다. 합격입니다.");
    }
  }
}

