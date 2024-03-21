package ch04_4;

public class S_doubleFor {
  public static void main(String[] args) {
    for (int i =2; i<10; i++) {
      for (int j = 1; j<10; j++) {
        System.out.printf("%dX%d=%d ", i,j,i*j);
      }
      System.out.println("");
    }
  }
}
