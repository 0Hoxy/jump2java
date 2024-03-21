package Exercise.javaStart;

public class s13 {
  public static void main(String[] args) {
    double height = 1000; //초기위치
    double gravitationalAcceleration = -9.81; //중력가속도
    double resistance = 0; //초기 속도
    double dropTime = 5.00; //이동 시간

    double finalResult = ((gravitationalAcceleration*(dropTime*dropTime))/2)+(resistance*dropTime)+height;

    System.out.printf("%.2f초 후 위치: %.2fm",dropTime, finalResult);


  }
}
