package ch06_1;

import java.util.Scanner;

public class Scanner_ {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(scanner.nextInt());
    scanner.close();
  }
}
