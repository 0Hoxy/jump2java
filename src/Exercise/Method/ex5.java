package Exercise.Method;

public class ex5 {
  public static void main(String[] args) {
    //어떤 게임이 있다. 이 게임은 주사위를 던져 나오는 눈의 수 만큼 달러를 획득한다. *주사위를 총 3번 던져 얻은 달러. 이를 환전한 결과를 출력하시오*
    //Math.random() 1과 6 사이의 숫자를 반환하는 dice()메소드를 구현 할 것, 1달러의 환율은 1082.25108 원으로 한다
    // 획득 금액: $12.00(12987원)
    double dollar = dice()+dice()+dice();
    double won = exchange(dollar);
    System.out.printf("획득 금액: $%.2f(%.0f원)",dollar,won);
  }

  public static int dice() {
    return (int) (Math.random()*6)+1;
  }
  public static double exchange(double dollar){
    return dollar*1082.25108;
  }
}
