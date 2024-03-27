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
// 같은 InputStream이지만 사용자가 인덱스를 3으로 입력했을때 3byte를 전부 읽는다. 입력한 수 보다 많이 출력할 경우 에러가 난다.
// 길이가 3byte인 배열을 만든 후 read 메소드의 입력값으로 전달한다.