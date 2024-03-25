package Exercise.Tclass;

public class Ex8 {
  public static void main(String[] args) {
    Hero arthas = new Hero("아서스");
    Hero leona = new Hero("레오나");

    Hero.battle(arthas, leona);
  }
}
class Hero {
  String name;
  int hp;

  public Hero(String str) {
    name = str;
    hp = 30;

  }

  public void punch(Hero enermy) {
    int damage = (int) (Math.random() * 10) + 1;
    enermy.hp -= damage;
  }

  public static void battle(Hero a, Hero b) {
    boolean firstAttack = true;
    while (a.hp > 0 && b.hp > 0) {
      if (firstAttack) {
        a.punch(b); // a가 b를 공격합니다.
        System.out.printf("[%s]의 펀치%n", a.name);
        System.out.printf("%s: %d/30%n", b.name, b.hp);
      } else {
        b.punch(a); // b가 a를 공격합니다.
        System.out.printf("[%s]의 펀치%n", b.name);
        System.out.printf("%s: %d/30%n", a.name, a.hp);
      }
      firstAttack= !firstAttack;
    }
  }
}

