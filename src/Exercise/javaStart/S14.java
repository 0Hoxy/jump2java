package Exercise.javaStart;

public class S14 {
  public static void main(String[] args) {
    int total = 152365;

    int a = (total/50000);
    int b = (total%50000/10000);
    int c = (total%50000%10000/5000);
    int d = (total%50000%10000%5000/1000);

    int e = (total%50000%10000%5000%1000);


    System.out.printf("5만원 x %d%n",a);
    System.out.printf("1만원 x %d%n",b);
    System.out.printf("5천원 x %d%n",c);
    System.out.printf("1천원 x %d%n",d);
    System.out.printf("--------------------------------------------------------%n");
    System.out.printf("총 장수: %d장%n",a+b+c+d);
    System.out.printf("금액: %d원%n",total-e);
    System.out.printf("할인: %d원",e);




  }
}
