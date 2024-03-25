package ch05_7;

interface Describable {
  //보통 인터페이스는 ~able로 끝난다.
  String getDescription(); //추상메소드
}
class Person implements Describable {
  @Override
  public String toString() {
    //toString메소드는 Object에서 객체의 주소를 출력(기본)
    //return super.toString(); //super는 부모객체라는 의미이다. this는 내 객체이다.
    return "Person 객체 입니다. 필드변수 없음";
  }

  @Override
  public String getDescription() {
    return "Person 입니다.";
  }
}

class Computer implements Describable{
  @Override
  public String toString() {
    return "컴퓨터 객체 입니다. 필드변수 없음";
  }

  @Override
  public String getDescription() {
    return "컴퓨터 입니다.";
  }
}
public class Practice {

  public static void main(String[] args) {

    //object 클래스는 모든 클래스의 부모클래스다(기본)
    Describable[] objs = {new Person(), new Computer()};

    for(Describable obj: objs){
      System.out.println(obj.getDescription());
    }
  }
}
