package ch08_1;

//1000미만의 3과 5의 배수의 합은?
public class Draining {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println("3과 5의 배수의 총합: " + sum);
  }
}

