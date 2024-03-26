package ch06_1;

import java.io.IOException;

public class InputStream {

  public static void main(String[] args) throws IOException {
    java.io.InputStream in = System.in;

    int a;
    int b;
    int c;

    a = in.read(); //콘솔에서 받은 입력을 input에 대입
    b= in.read(); //콘솔에서 받은 입력을 input에 대입
    c = in.read(); //콘솔에서 받은 입력을 input에 대입

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
