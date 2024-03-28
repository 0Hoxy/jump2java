package ch07_4;

public class Finally {
  public void shouldBeRun() {
    System.out.println("ok, thanks");
  }

  public static void main(String[] args) {
    Finally sample = new Finally();
    int c;
    try {
      c = 4 / 0;
    } catch (ArithmeticException e) {
      c = -1;
    } finally {
      sample.shouldBeRun();
    }
  }
}

