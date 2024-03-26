package ch06_2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {

  public static void main(String[] args) throws IOException {
    FileOutputStream output = new FileOutputStream("out.txt");
    //파일이 위치에 없으면 자동으로 만들고 이후는 파일쓰기에 해당된다
    for (int i = 1; i < 11; i++) {
      String data = i + "번째 줄입니다.\r\n"; // \r\n 한줄 띄운 뒤 라인 맨앞으로
      output.write(data.getBytes()); // 파일에 데이터를 쓴다.
    }
    output.close();
  }
}
