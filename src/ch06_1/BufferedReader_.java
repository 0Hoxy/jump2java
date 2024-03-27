package ch06_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReader_ {
  public static void main(String[] args) throws IOException {
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);

    String a = br.readLine();
    System.out.println(a);
  }
}

//BufferedReader란 길이에 상관없이 사용자가 입력한 문잣값을 모두 읽어 들일 때 사용한다

/*
InputStream: byte를 읽는다.
InputStreamReader: character(문자)를 읽는다.
BufferedReader: String(문자열)을 읽는다.
 */