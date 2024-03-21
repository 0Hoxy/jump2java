package Exercise.Method;

public class ex8 {
  public static void main(String[] args) {
    /*아이돌 데뷔를 위한 연습생 오디션이 개최되었다.
    해당 오디션은 보컬과 댄스를 평가하여 각각 최대 10.0의 점수를 줄 수 있는데, 두 점수의 곱이 70.0 이상일 때 합격하게 된다.
    주어진 코드의  result() 메소드를 완성하여, Tom과 Kate의 합격 여부를 출력하시오.*/
    // String result=(score>=60)?"통과":"실패"; *60점 이상인 경우 통과, 그 외의 경우는 실패를 반환합니다.
    // (조건식)? 참의 반환 값:거짓의 반환 값;
    double tomVocal = 8.8;
    double tomDance = 7.6;
    double kateVocal = 9.2;
    double kateDance = 7.8;

    System.out.printf("Tom의 오디션 결과: %s%n", test(tomVocal,tomDance));
    System.out.printf("Kate의 오디션 결과: %s%n", test(kateVocal,kateDance));
  }
  private static String test(double Vocal, double Dance) {
    return ((Vocal*Dance)>=70)?"합격":"불합격";
  }
}
