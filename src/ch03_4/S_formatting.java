package ch03_4;

public class S_formatting {
  public static void main(String[] args) {
    int appleNumber = 7;
    String s = String.format("나는 사과 %d개를 먹는다.", appleNumber);
    System.out.println(s);

    String appleString = "다섯개";
    String s2 = String.format("나는 사과 %s를 먹는다.", appleString);
    System.out.println(s2);
    // 2개의 값을 넣기
    //String s3 = String.format("나는 사과 %d개 먹고 너는 %s 개를 먹어라.", appleNumber, appleString);

    // %s 는 문자열 %c는 문자 1개 %d는 정수 %f는 부동 소수 %o는 8진수 %x는 16진수 %%는 특수 문자%

    System.out.println(String.format("%10s", "hi."));
    // 공백을 뒤에 주기
    System.out.println(String.format("%-10sjane", "hi."));
    // -는 공백이 뒤에 간다
    System.out.println(String.format("%.4f", 3.4213123123123));
    System.out.println(String.format("%10.4f", 3.4213123123123));
  }
}
