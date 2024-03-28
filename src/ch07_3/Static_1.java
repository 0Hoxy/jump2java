package ch07_3;

class Counter1 {
  static int count = 0;
  //스테틱 변수는 객체 없이 사용가능하고 다른객체들도 공유할 수 있다.
  Counter1() {
    this.count++;
    System.out.println(this.count);
  }
}
public class Static_1 {
  public static void main(String[] args) {
    Counter1 c1 = new Counter1();
    Counter1 c2 = new Counter1();
    Counter1 c3 = new Counter1();
    Counter1 c4 = new Counter1();
  }
}
