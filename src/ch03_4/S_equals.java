package ch03_4;

public class S_equals {
    public static void main(String[] args) {
        //문자열 내장 매소드
        String a = "hello";
        String b = "Java";
        String c = "hello";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        // 문자열 비교시 반드시 ==대신 equals 메소드 사용
    }
}
