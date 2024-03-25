package Exercise.JavaStart;

public class s09 {
  public static void main(String[] args) {
//    속도(m/s) = 거리(m) / 시간(s)
    double m = 100;
    double s = 18;
    double km = 0.1;
    double bh = s/60/60;
    double kmh = km/bh;
    System.out.printf("%.1f km/h",kmh);
  }
}
