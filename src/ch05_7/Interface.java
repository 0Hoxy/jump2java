package ch05_7;

public class Interface {
  public static void main(String[] args) {


    Tiger tiger = new Tiger(); // 호랑이 객체
    Lion lion = new Lion(); // 사자 객체
    System.out.println(tiger.getFood());
    System.out.println(lion.getFood());
    tiger.printFood();
    lion.printFood();
  }
}

interface Predator /*포식동물*/ {
  //인터페이스 선언 class 대신에 interface 사용
  String getFood(); //추상메소드: 메소드 코드가 없음 (리턴과 입력만 있음)

  //디폴트메소드는 추상메소드와 달리 공통적으로 사용가능한 메소드
  default void printFood() {
    System.out.printf("my food is %s\n",getFood());
  }

}

class Animal {
  String name;

  void SetName(String name) {
    this.name/*필드변수*/ = name;/*생성자*/
  }
}
//인터페이스는 클래스에서 implements로 구현한다.

class Tiger extends Animal implements Predator {
  //인터페이스 구현시 추상클래스를 무조건 구현해야 한다.
  @Override
  public String getFood() {
    return "apple";
  }
}

class Lion extends Animal implements Predator {

  @Override
  public String getFood() {
    return "banana";
  }
}
class Zookeeper {
  public void feed(Predator predator) {
    System.out.println("feed " + predator.getFood());
  }
}
