package Exercise.JavaStart;

public class s08 {
  public static void main(String[] args) {
    int totalSec = 7582;
    int sec = 7582%60;
    int min = 7582/60%60;
    int hour = 7582/60/60;

    System.out.printf("%d시간 %d분 %d초", hour, min, sec);
  }
}
