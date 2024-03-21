package ch03_4;

public class S_indexOf {
  public static void main(String[] args) {
    String a = "hello java";
    System.out.println(a.indexOf(" "));
    //indexOf는 문자열에서 특정 문자열이 시작되는 위치 (인덱스값)
    System.out.println(a.contains("java"));
    //contains는 문자열에서 특정 문자열이 존재하는지 검사
    System.out.println(a.charAt(6));
    //charAt는 문자열에서 특정 인덱스에 해당하는 문자를 반환한다.
    System.out.println(a.replaceAll("java","world"));
    //replaceAll는 문자열에서 특정 문자열을 대체한다.
    //regex는 대체될 문자, replacement는 대체할 문자
    System.out.println(a.substring(0,4));
    //substring는 문자열에서 특정 인덱스에 해당하는 문자를 반환한다. 마지막 번호는 포함이 안된다. 시작위치는 0
    System.out.println(a.toUpperCase());
    System.out.println(a.toLowerCase());
    //toUpperCase 대문자, toLowerCase 소문자
    String b = "a:b:c:d";
    System.out.println(b.split(":"));
    //split는 문자열에서 특정 문자를 기준으로 나눈다.
  }
}
