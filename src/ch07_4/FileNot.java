package ch07_4;

import java.io.*;

public class FileNot {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
    br.readLine();
    br.close();
    //존재하지 않는 파일을 열려고 시도할 때 FileNotFoundException(파일을 찾을 수 없음 예외) 예외 발생
  }
}

