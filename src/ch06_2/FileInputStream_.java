package ch06_2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {

  public static void main(String[] args) throws IOException {
    byte[] b = new byte[1024];
    FileInputStream input = new FileInputStream("out.txt");
    input.read(b);
    System.out.println(new String(b));
    input.close();
  }
}
