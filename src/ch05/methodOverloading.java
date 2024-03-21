package ch05;

//메소드오버로딩: 동일한 이름의 입력이 다른 메소드를 만듦
class Tiger {
  void sleep() {
    System.out.println("호랑이가 잡니다...");
  }

  void sleep(int time) {
    System.out.println("호랑이가 " + time + " 만큼 잡니다...");
  }
}

public class methodOverloading {
  public static void main(String[] args) {
    Tiger tiger = new Tiger();
    tiger.sleep();
    tiger.sleep(3);
  }
}
