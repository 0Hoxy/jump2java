package ch05;

class Calculator {
  int result = 0;

  int add(int num) {
    result += num;
    return result;
  }
}

public class objectExamples {
  public static void main(String[] args) {
    Calculator cal1 = new Calculator();
    cal1.add(3);
    cal1.add(4);
    cal1.add(43);
    System.out.println(cal1.result);
    Calculator cal2 = new Calculator();
    cal2.add(3);
    cal2.add(4);
    cal2.add(41);
    System.out.println(cal2.result);
  }
}
