package ch03_9;

import java.util.Arrays;
import java.util.HashSet;

public class S_setmethod {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    set.add("jump");
    set.add("To");
    set.add("Java");
    System.out.println(set);
    //addAll로 여러개 추가하기
    set.addAll(Arrays.asList("HTML", "CSS", "JS"));
    System.out.println(set);
    //remove로 제거
    set.remove("To");
    System.out.println(set);
  }
}

