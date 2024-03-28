package ch07_4;

public class ArithmeticExceptions extends Throwable {
  public static void main(String[] args) {
    int c = 4 / 0; // 0으로 나누면 ArithmeticExceptions(산술 예외) 예외 발생
  }
}

