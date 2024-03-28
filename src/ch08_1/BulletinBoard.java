package ch08_1;

interface getTotalPage {
  int dev (int a, int b);
}
public class BulletinBoard {

  public static void main(String[] args) {
    getTotalPage page = (int a, int b) -> a / b + 1;
    System.out.println(page.dev(1, 10));
    System.out.println(page.dev(10, 10));
    System.out.println(page.dev(20, 10));
    System.out.println(page.dev(28, 10));

  }
}