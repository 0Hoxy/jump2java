package javaApi;

public class KnightTest {
  public static void main(String[] args) {
    Knight knight1 = new Knight("돈키호테", 30);
    System.out.println("[객체생성]");
    System.out.printf("\t%s\n", knight1.toString());
    //체력증가 hp+30
    knight1.setHp(knight1.getHp() + 30);
    //결과 출력
    System.out.println("체력 증가 + 30]");
    System.out.printf("\t%s\n", knight1.toString());

  }
}

class Knight {

  //필드
  private String name;
  private int hp;

  //생성자
  public Knight(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  //getSet 메소드 hp
  //getter와 setter를 이용하면 private 필드를 우회적으로 가져올 수 있다.

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
  //toString

  @Override
  public String toString() {
    return "Knight{ " + "name='" + name + '\'' + ", hp=" + hp + " }";
  }
}
