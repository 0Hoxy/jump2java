package Exercise.method;

public class ex13_2 {
  public static void main(String[] args) {
    printPay(10.00, 40);
    printPay(10.00, 50);
    printPay(7.50, 38);
    printPay(8.50, 66);
  }

  private static void printPay(double basePay, double time) {
    double pay = (basePay * time);
    double overtimePay = (time - 40) * basePay * 0.5;
    System.out.println((time > 60) ? "초과 근무시간 에러!" : (time > 40) ? String.format("$ %.2f", pay + overtimePay) : (basePay < 8) ? "최저 시급 에러!" : String.format("$ %.2f", pay));
  }
}