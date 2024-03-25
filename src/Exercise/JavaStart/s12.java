package Exercise.JavaStart;

public class s12 {
  public static void main(String[] args) {
    int a = 374;
    int onedig = a%10;
    int tendig = a/10%10;
    int hundig = a/100;
    System.out.printf("총합: %d", onedig+tendig+hundig);
  }
}
