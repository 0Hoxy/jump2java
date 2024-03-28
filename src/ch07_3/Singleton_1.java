package ch07_3;

public class Singleton_1 {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance(); //객체생성
    Singleton singleton2 = Singleton.getInstance(); //같은객체
    System.out.println(singleton1 == singleton2);
  }
}

class Singleton {
  //싱글톤 패턴: 단 하나의 객체를 만드는 방법
  private static Singleton one; //다른클래스에서 접근불가 [private]
  private Singleton() {
  }//생성자를 private으로 다른 클래스에서 만들지 못하도록 하였음

  public static Singleton getInstance() {
    if (one == null) {
      one = new Singleton(); //처음 한번 객체가 생성됨.
    }
    return one;
  }
}
