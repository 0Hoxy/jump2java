package ch07_1.house;

public class HousePark {
  protected String lastname = "park";
  //protected가 붙은 변수나 메소드는 "동일 패키지"의 클래스 또는 해당 클래스를 "상속받은 클래스"에서만 접근가능
  public String info = "this is public message.";
  public static void main(String[] args) {
    HouseKim kim = new HouseKim();
    System.out.println(kim.lastname); //HouseKim 클래스의 lastname 변수를 사용할 수 있다.
    HousePark housePark = new HousePark();
    System.out.println(housePark.info);
  }
}
