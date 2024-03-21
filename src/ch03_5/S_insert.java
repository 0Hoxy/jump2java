package ch03_5;

public class S_insert {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    sb.append("jump to java");
    sb.insert(0,"hello "); //원하는 위치에 문자열 입력
    System.out.println(sb.toString());
  }
}
