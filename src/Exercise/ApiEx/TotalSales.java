package Exercise.ApiEx;

import java.util.ArrayList;

public class TotalSales {

  public static void main(String[] args) {
    ArrayList<Menu> order = new ArrayList<>();
    order.add(new Menu("김밥", 2000, 57));
    order.add(new Menu("돈까스", 6000, 29));
    order.add(new Menu("냉면", 5000, 34));

    Store store = new Store();
    for (Menu menu : order) {
      store.add(menu);
    }
    System.out.printf("총 매출: %d원",store.totalSales());
  }
}

class Menu {
  String name;
  int price;
  int count;

  public Menu(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public int getPrice() {
    return price;
  }

  public int getCount() {
    return count;
  }
}

class Store {
  ArrayList<Menu> list;

  public Store() {
    this.list = new ArrayList<Menu>();
  }

  public void add(Menu menu) {
    list.add(menu);
  }

  public int totalSales() {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i).getPrice()*list.get(i).getCount();
    }
    return sum;
  }
}
