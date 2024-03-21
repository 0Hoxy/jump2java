package ch05;

class Animal {
  String name;

  public void setName(String name) {
    this.name = name;
  }
}


public class instanceVariable {
  public static void main(String[] args) {
    Animal cat = new Animal();//cat 객체 생성
    System.out.println(cat.name);
    cat.name = "모먀미";//객체변수에 값을 입력
    System.out.println(cat.name);
    Animal cat2 = new Animal();//cat2 객체 생성
    cat2.name = "고양이";
    System.out.println(cat2.name);
  }
}
