package Exercise.Method;

public class ex9 {
  public static void main(String[] args) {
    //신사옥의 엘레베이터는 저층과 고층으로 나뉘어 운행된다. 저층은 1~10층, 고층은 11~20층을 운행한다.
    //방문 층수를 입력받아 타야 할 엘레베이터를 반환하는 메소드 guide()를 완성하여, 출력 예와 같은 결과를 얻으시오.
    // 13층 -> 고층 엘레베이터
    // 7층 -> 저층 엘레베이터
    // 10층 -> 저층 엘레베이터
    int a = 13;
    int b = 7;
    int c = 10;

    System.out.printf("%d층 -> %s 엘레베이터%n", a, guide(a));
    System.out.printf("%d층 -> %s 엘레베이터%n", b, guide(b));
    System.out.printf("%d층 -> %s 엘레베이터%n", c, guide(c));
  }
  private static String guide(int floor) {
    if (floor>10) {
      return "고층";
    } else {
      return "저층";
    }
  }
}
