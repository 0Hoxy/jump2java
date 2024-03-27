package ch06_1;

import java.util.Scanner;

public class Scanner_ {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(scanner.nextInt());
    scanner.close();
  }
}
//Scanner란 다양한 값을 읽어 들이는 메소드와 함께 사용한다
/*
next: "토큰"을 읽어 들일 수 있다.
nextLine: "라인"을 읽어 들일 수 있다.
nextInt: "정수"를 읽어 들일 수 있다.
 */
//토큰이란 예를 들면 int x = 10; 을 토큰으로 분할하면 int, x, = ,10 ,; 이 된다 각각 키워드, 식별자, 연산자, 숫자, 구분 기호가 하나하나 다 토큰인 것이다.

//System.out.println 메소드: 콘솔에 문자열을 출력할 때나 디버깅할 때 많이 사용한다
//System.err 메소드: 오류 메세지를 출력할 때 사용한다, System.out과 동일한 역할이다 (글자색은 다르게 나옴)