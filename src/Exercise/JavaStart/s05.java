package Exercise.JavaStart;

public class s05 {
  public static void main(String[] args) {
    int euro = 52;
    int dollar = 32;

    double euroToKrw = 1281.62664;
    double dollarToKrw = 1091.70306;

    double result = (euro * euroToKrw) + (dollar * dollarToKrw);

    System.out.printf("환전결과: %.0f원", result);

  }
}
