package ch05_7;

//추상클래스는 클래스앞에 abstract이 붙는다.
abstract class Gameobject {
  //클래스도 되고 인터페이스 추상메소드도 만들 수 있다. (2개를 동시에 가능), abstract는 inplements가 아니라 extends 인듯?
  String name;
  void game() {
    System.out.println("게임시작!");
  }
  abstract void describe();

}

class Player extends Gameobject {
  @Override
  void describe() {
    System.out.println("플레이어 입니다.");
  }
}

class Monster extends Gameobject{
  @Override
  void describe() {
    System.out.println("몬스터 입니다.");
  }

}
public class AbstractClass {

  public static void main(String[] args) {
    //플레이어 객체와 몬스터 객체는 게임오브젝트를 상속했으므로 선언가능
    Gameobject[] gmob = {new Player(), new Monster()};

    for (Gameobject obj : gmob) {
      System.out.println(obj); //객체주소 toString메소드
      obj.describe();
      obj.game();//추상메소드 구현(다형성)
    }
  }
}
