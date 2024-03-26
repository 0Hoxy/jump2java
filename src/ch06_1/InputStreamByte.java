package ch06_1;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamByte {

  public static void main(String[] args) /*예외처리*/throws IOException {
    InputStream in = System.in;

    byte[] a = new byte[3];
    in.read(a);

    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
  }
}
