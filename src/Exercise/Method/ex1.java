package Exercise.Method;

public class ex1 {
  public static void main(String[] args) {
    System.out.println("Line 1");
    threeLines();
    System.out.println("Line 2");
  }

  public static void threeLines(){
    oneLine();
    oneLine();
    oneLine();
  }
  public static void  oneLine(){
    System.out.println();
  }
}
