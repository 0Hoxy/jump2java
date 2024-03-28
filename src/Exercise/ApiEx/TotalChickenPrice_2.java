package Exercise.ApiEx;

import java.util.ArrayList;

public class TotalChickenPrice_2 {

  public static void main(String[] args) {
    ArrayList<Chicken1> order = new ArrayList<>();
    order.add(new Chicken1("로스트 치킨", 9900));
    order.add(new Chicken1("파닭 치킨", 12900));
    order.add(new Chicken1("마늘아 치킨", 13900));

    int sum = 0;
//    for (int i = 0; i < order.size(); i++) {
//      sum += order.get(i).getPrice();
    for (Chicken1 c : order) {
      sum += c.getPrice();

    }
    System.out.printf("총합: %d원",sum);
  }
}

class Chicken1 {
  String name;
  int price;

  public Chicken1(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}
