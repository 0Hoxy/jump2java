package ch03_5;

public class S_StringBuffer {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer(); //StringBuffer 객체를 만들어서 문자를 추가
    sb.append("hello"); //문자열 추가
    sb.append(" ");
    sb.append("jump to java");
    String result = sb.toString(); //.toString은 모든 문자열을 모아서 리턴한다.
    System.out.println(result);

    //문자열을 더하기 (+)로 추가
    result = ""; //결과를 빈 문자열로 만들기
    result += "hello";
    result += " ";
    result += "jump to java";
    System.out.println(result);

  }
}