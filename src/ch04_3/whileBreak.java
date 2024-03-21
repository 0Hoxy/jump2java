package ch04_3;

public class whileBreak {
  public static void main(String[] args) {
    int coffee = 10;
    int money = 1000;
    while (money >= 1000) {
      System.out.println("커피를 추출 합니다.");
      coffee--;
      System.out.println("남은 커피의 양은" + coffee + "입니다.");
      if (coffee == 0) {
        System.out.println("커피가 품절되었습니다. 판매종료");
        break;
      }
    }
  }
}
