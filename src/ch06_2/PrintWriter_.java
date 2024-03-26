package ch06_2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriter_ {

  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter("out3.txt");
    for (int i = 1; i < 10; i++) {
      String data = i + "번째 줄입니다.\r\n"; // \r\n 한줄 띄운 뒤 라인 맨앞으로
      pw.print(data); //문자열을 쓰기
    }
  }
}
