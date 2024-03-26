package ch06_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("out.txt"));
    while (true) {
      String line = br.readLine(); //한줄씩 문자열을 읽는다
      if(line==null) break; //더이상 읽을줄이 없으면 반복문 종료
      System.out.println(line); //읽은 줄을 바로바로 출력하기
    }
    br.close(); //파일 읽은 후 객체종료
  }
}
