package Exercise.Inheritance;

import java.util.*;

public class CurrencyTest {

  public static void main(String[] args) {
    KRW krw = new KRW(1500, "원");
    USD usd = new USD(100.50, "달러");
    EUR eur = new EUR(260.87, "유로");
    JPY jpy = new JPY(1400, "엔");

    Currency[] currencies = {krw, usd, eur, jpy};

    for (Currency c : currencies) {
      System.out.println(c.toString());
    }
  }
}

class Currency {
  String name;
  double money;

  public Currency(double amount, String notation) {
    this.name = notation;
    this.money = amount;

  }
  public String toString() {
    return String.format("%s: %.2f %s",getClass().getSimpleName(), money, name);
  }
}

class KRW extends Currency {
  public KRW(double amount, String notation) {
    super(amount, notation);
  }
}

class USD extends Currency {
  public USD(double amount, String notation) {
    super(amount, notation);
  }
}

class EUR extends Currency {
  public EUR(double amount, String notation) {
    super(amount, notation);
  }
}

class JPY extends Currency {
  public JPY(double amount, String notation) {
    super(amount, notation);
  }
}
