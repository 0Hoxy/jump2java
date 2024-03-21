package Exercise.Method;

public class ex4 {
  public static void main(String[] args) {
    double fuel = 8.86;
    double aTotal = 182.736;
    double result = fuelEconomy(fuel, aTotal);
    System.out.printf("연비: %.2f km/L",result);
  }

  public static double fuelEconomy(double fuel, double aTotal){
    return aTotal/fuel;
  }
}
