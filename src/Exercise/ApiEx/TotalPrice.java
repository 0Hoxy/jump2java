package Exercise.ApiEx;

import java.util.ArrayList;

public class TotalPrice {
  public static void main(String[] args) {

    String[] itemNames = {"스트라이프 셔츠", "슬림 면바지", "스니커즈"};
    int[] itemPrices = {49900, 58900, 46900};

    Cart myCart = new Cart();
    for (int i = 0; i < itemNames.length; i++) {
      myCart.addItem(itemNames[i], itemPrices[i]);
    }

    System.out.printf("총합: %d원", myCart.totalPrice());
  }
}

class Cart {
  private ArrayList<Item> list;

  public Cart() {
    this.list = new ArrayList<Item>();
  }

  public void addItem(String name, int price) {
    Item item = new Item(name, price);
    list.add(item);
  }

  public int totalPrice() {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i).getPrice();
    }
    return sum;
  }

  private class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
      this.name = name;
      this.price = price;
    }

    public int getPrice() {
      return price;
    }
  }
}


