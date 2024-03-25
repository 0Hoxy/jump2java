package Exercise.Tclass;
//Food 클래스는 이름과 가격을 필드로, 메소드로는 toString()을 갖는다.

/* Food { name: 치킨, price: 18000원}
   Food { name: 피자, price: 28000원}
   Food { name: 초밥세트, price: 22000원}*/

public class ex2 {
  public static void main(String[] args) {
    Food chicken = new Food("치킨", 18000);
    Food pizza = new Food("피자", 28000);
    Food sushi = new Food("초밥세트", 22000);

    Food[] foods = {chicken, pizza, sushi};

    for (int i = 0; i < foods.length; i++) {
      System.out.println(foods[i].toString());
    }
  }
}
class Food {
  String name;
  int price;

  public Food(String name, int price) {
    this.name = name;
    this.price = price;
  }
  public String toString() {
    return "Food { name: " + name + ", price: " + price + "원}";
  }
}