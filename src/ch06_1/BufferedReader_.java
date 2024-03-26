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

