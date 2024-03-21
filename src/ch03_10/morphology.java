package ch03_10;

public class morphology {
  public static void main(String[] args) {
    String num = "123";
    //문자열을 숫자로 변환
    int n = Integer.parseInt(num);
    double d = Double.parseDouble(num);
    System.out.println(n+100);
    System.out.println(d);
    //숫자를 문자열로 변환
    String num2 = ""+n; //문자열+숫자=>문자열
    System.out.println(num2);
    //메소드를 사용해서 문자열 변환
    String num3 = String.valueOf(123);
    String num4 = Integer.toString(123);
    System.out.println(num3);
    System.out.println(num4);
    //소수점이 있는 문자열 변환
    String num5 = "123.456";
    Double d1 = Double.parseDouble(num5);
    System.out.println(d1);
    //정수와 실수 사이의 형 변환
    int n2 = 123;
    double d2 = n2; //정수를 실수로 바꿀때 자동변환
    System.out.println(d2);
    double d3 = 123.456;
    int n3 = (int)d3; // ()를 가지고 강제로 캐스팅해준다.
    System.out.println(n3);
    //실수형태 문자열을 정수로 변환시 주의
    String num6 = "123.456";
    double n6 = Double.parseDouble(num6);
  }
}
