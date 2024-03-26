package ch06_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_2 {

  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter("out4.txt");
    for (int i = 1; i < 10; i++) {
      String data = i + "번째 줄입니다.\r\n"; // \r\n 한줄 띄운 뒤 라인 맨앞으로
      pw.print(data); //문자열을 쓰기
    }
    pw.close();
    PrintWriter pw2 = new PrintWriter(new FileWriter("out4.txt",true));
    for (int i = 1; i < 10; i++) {
      String data = i + "번째 줄입니다.\r\n"; // \r\n 한줄 띄운 뒤 라인 맨앞으로
      pw2.print(data); //문자열을 쓰기
    }
    pw2.close();
  }
}
