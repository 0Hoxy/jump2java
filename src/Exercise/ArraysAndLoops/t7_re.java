package Exercise.ArraysAndLoops;

public class t7_re {
  public static void main(String[] args) {
    //Math.pow() 메소드는 밑이 되는 a와 지수 b를 입력받아 a의 b승 값을 실수로 반환합니다.
    //아래는 2의 3승을 결과를 정수로 얻는 예 입니다.
    //int result = (int) Math.pow(2,3);

    //적절한 온도에서 배양하면 하루에 두 배씩 번식하는 세균이 있다. 첫날 한 마리의 세균을 배양하며 1일 뒤 두 마리가 되고,
    //2일 뒤에는 네마리, 3일 뒤에는 8마리,...,마지막 9일 뒤에 512마리가 되었다.
    //위 과정을 준비된 코드를 통해 배열에 기록하고 출력하려 한다. 출력 예와 같은 결과를 얻도록, writeLog() 메소들를 완성하시오.

    //배열생성
    int[] bacteriaCountLog = new int[10];
    //개체 수 기록
    writeLog(bacteriaCountLog);
    //결과 출력
    printLog(bacteriaCountLog);
  }

  private static void writeLog(int[] logs) {
    for (int i = 0; i < logs.length; i++) {
      logs[i] = (int) Math.pow(2, i);
    }
  }

  private static void printLog(int[] symbol) {
    System.out.printf("[");
    for (int i = 0; i < symbol.length; i++) {
      System.out.printf("%d",symbol[i]);
      if(i < symbol.length-1){
        System.out.printf(", ");
      }
    }
    System.out.printf("]");
  }
}
