package ch04_4;
import java.util.*;

public class S_forEach {
  public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>(Arrays.asList("1","2","3"));
    //foreach문은 리스트에서 아이템을 한개씩 꺼내어 반복한다.
      for (String number : numbers) {
        System.out.println(number);
      }
  }
}
