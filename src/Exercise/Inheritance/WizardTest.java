package Exercise.Inheritance;

public class WizardTest {

  public static void main(String[] args) {
    GreatWizard gandalf = new GreatWizard("간달프", 100, 100, 100);
    //객체생성
    System.out.println(gandalf.toString());
    //상태출력
    gandalf.energeVolt();
    //에너지볼트
  }
}

class Novice {
  String name;
  int hp;

  public Novice(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  public String toString() {
    return String.format("[초보자] %s(HP: %d)", name, hp);
  }
}

class Wizard extends Novice {
  int mp;

  public Wizard(String name, int hp, int mp) {
    super(name, hp);
    this.mp = mp;
  }

  public String toString() {
    return String.format("[마법사] %s(HP: %d, MP: %d)", name, hp, mp);
  }
}

class GreatWizard extends Wizard {
  int shield;
  int buff;

  public GreatWizard(String name, int hp, int mp, int shield) {
    super(name, hp, mp);
    this.shield = shield;
    this.buff = 30;
  }

  public String toString() {
    return String.format("[대마법사] %s(HP: %d, MP: %d, SHIELD: %d", name, hp, mp, shield);
  }
  public void energeVolt() {
    System.out.printf("%s의 에너지볼트! (대마법사 버프로 데미지 +%d추가)\n",name,buff);
  }
}
