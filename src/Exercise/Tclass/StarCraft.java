package Exercise.Tclass;

public class StarCraft {
  public static void main(String[] args) {
    Marine marine = new Marine("마린", 80);
    Medic medic = new Medic("메딕", 60);

    marine.stimPack();
    medic.heal(marine);
  }
}

class Marine {
  String name;
  int hp;

  //생성자(필드값 초기화)
  public Marine(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  //메소드
  public void stimPack() {
    System.out.printf("[%s]의 스팀팩! HP: %d -> ", name, hp);
    hp = hp - 10;
    System.out.printf("%d%n", hp);
  }
}

class Medic {
  String name;
  int hp;

  public Medic(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  public void heal(Marine target) {
    System.out.printf("[%s]의 치유! %sHP(%d -> ", name, target.name, hp);
    target.hp += 10;
    System.out.printf("%d)%n", target.hp);
  }
}