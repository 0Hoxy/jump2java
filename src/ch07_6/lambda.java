package ch07_6;

interface Calculator {
  int sum(int a, int b);
}
//람다(lambda)
// 일반적인 코드 : 두 개의 정수를 입력으로 받아 정수의 결과값을 리턴하는 sum 함수를 정의한 인터페이스
/* class MyCalculator implements Calculator {
  @Override
  public int sum(int a, int b) {
    return a + b;
  }
}
public class lambda {
  public static void main(String[] args) {
    Calculator mc = new MyCalculator();
    int result = mc.sum(3, 4);
    System.out.println(result);
  }
} */

// 적용한 코드
/* public class lambda {
  public static void main(String[] args) {
    Calculator mc = (int a, int b) -> a + b;//람다를 적용한 코드
    int result = mc.sum(3, 4);
    System.out.println(result);
  }
} */

//람다 함수를 사용하면 MyCalculator와 같은 실제 클래스 없이도 Calculator 객체를 생성할 수 있고, 일반적인 코드보다 훨씬 간단해짐
// 인터페이스 사용 시 주의 사항
// 인터페이스의 메소드가 1개 이상이면 람다 함수를 사용할 수 없음(단 1개의 메소드만 가질 수 있게 하는 역할)
// 람다 함수로 사용할 인터페이스는 @Functionalinterface 어노테이션을 사용하는 것이 좋음

public class lambda {
  public static void main(String[] args) {
    Calculator mc = (a, b) -> a + b;
    int result = mc.sum(3, 4);
    System.out.println(result);
  }
}
//람다 축약하기
// 람다를 적용한 자바 코드는 조금 더 축약이 가능하다
// 인터페이스에 이미 입출력에 대한 타입이 정의되어 있으므로 입력값의 자료형인 int를 생략할 수 있다.