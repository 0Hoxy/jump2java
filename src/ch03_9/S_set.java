package ch03_9;

import java.util.Arrays;
import java.util.HashSet;

public class S_set {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
    //집합(set): 순서가 없고 중복되지 않음.
    System.out.println(set);

    HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
    HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

    HashSet<Integer> intersection = new HashSet<>(s1);
    intersection.retainAll(s2);
    System.out.println(intersection);

    HashSet<Integer> union = new HashSet<>(s1);
    union.addAll(s2);
    System.out.println(union);

    HashSet<Integer> subtract = new HashSet<>(s1);
    subtract.removeAll(s2);
    System.out.println(subtract);
  }
}
