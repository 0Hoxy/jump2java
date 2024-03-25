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
}

