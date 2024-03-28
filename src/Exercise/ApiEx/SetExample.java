package Exercise.ApiEx;

import java.util.TreeSet;

public class SetExample {
  public static void main(String[] args) {
    TreeSet<String> names = new TreeSet<String>();
    names.add("Adam");
    names.add("Brian");
    names.add("Cate");
    names.add("Daniel");
    names.add("Eugene");

    System.out.printf("names.size() -> %d\n",names.size());
    System.out.printf("names.first() -> %s\n",names.first());
    System.out.printf("names.last() -> %s\n",names.last());

    System.out.println("==for each 구문 출력==");
    for (String str : names) {
      System.out.println(str);
    }
  }
}
