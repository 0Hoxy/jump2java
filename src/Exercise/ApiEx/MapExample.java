package Exercise.ApiEx;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class MapExample {

  public static void main(String[] args) {
    HashMap<String, String> emails = new HashMap<String, String>();

    emails.put("홍팍", "sehong@cloudstudying.kr");
    emails.put("나리", "nari@cloudstudying.kr");
    emails.put("정애", "jungae@cloudstudying.kr");

    System.out.printf("emails.size() -> %d\n", emails.size());

    System.out.println("==key set==");
    for (String key : emails.keySet()) {
      System.out.println(key);
    }
    System.out.println("==values==");
    for (String values : emails.values()) {
      System.out.println(values);
    }
  }
}
