package ch03_6;

public class S_array {
  public static void main(String[] args) {
    //[]는 배열의 기호 int[]는 숫자배열 String[]는 문자의 배열
    String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
    System.out.println(weeks[3]);

    for(int i = 0; i < weeks.length; i++) {
      //배열길이: 이름.length
      System.out.println(weeks[i]);
    }
    //배열에 흔한 오류(배열 길이를 잘못 판단)
    System.out.println(weeks[weeks.length - 1]);

    //정수배열
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      System.out.println(nums.length);
    }
  }

