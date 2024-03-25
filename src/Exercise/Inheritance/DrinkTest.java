package Exercise.Inheritance;

public class DrinkTest {

  public static void main(String[] args) {
    Juice j = new Juice("Juice");
    Coffee c = new Coffee("Coffee");
    Beer b = new Beer("Beer");
    Water w = new Water("Water");
    Tea t = new Tea("Tea");

    Drink[] drinks = {j, c, b, w, t};

    for (Drink d : drinks) {
      d.ordered();
    }
  }
}

class Drink {
  String name;

  Drink(String name){
    this.name = name;

  }
  void ordered() {

    System.out.println(name + " 주문되었습니다.");
  }
}

class Juice extends Drink {
  Juice(String name) {
    super(name);
  }
}

class Coffee extends Drink {
  Coffee(String name) {
    super(name);
  }
}

class Beer extends Drink {
  Beer(String name) {
    super(name);
  }
}

class Water extends Drink {
  Water(String name) {
    super(name);
  }
}

class Tea extends Drink {
  Tea(String name) {
    super(name);
  }
}

