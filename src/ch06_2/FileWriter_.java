package ch06_2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {

  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("out2.txt");
    for (int i = 1; i < 10; i++) {
      String data = i + "번째 줄입니다.\r\n"; // \r\n 한줄 띄운 뒤 라인 맨앞으로
      fw.write(data); //문자열을 쓰기
    }
    fw.close();
  }
}
