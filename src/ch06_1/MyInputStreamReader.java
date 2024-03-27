package ch06_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyInputStreamReader {
  public static void main(String[] args) throws IOException {
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    char[] a = new char[3];
    reader.read(a);

    System.out.println(a);
  }
}
// InputStreamReader란 사용자가 입력한 문잣값을 그대로 출력할 때 사용한다