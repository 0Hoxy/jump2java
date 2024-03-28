package Exercise.ApiEx;

import java.util.ArrayList;

public class TotalChickenPrice {

  public static void main(String[] args) {
    ArrayList<Chicken> order = new ArrayList<>();
    //주문한 치킨을 ArrayList에 추가하세요.
    order.add(new Chicken("로스트 치킨", 9900));
    order.add(new Chicken("파닭 치킨", 12900));
    order.add(new Chicken("마늘아 치킨", 13900));

    //ArrayList를 순회하여 총합을 구하세요.
    int sum = 0;
    for (Chicken Chicken : order) {
      sum += Chicken.getPrice();
    }

    //결과 출력
    System.out.printf("총합: %d원\n", sum);
  }
}

class Chicken {
  private String name;
  private int price;

  public Chicken(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}

