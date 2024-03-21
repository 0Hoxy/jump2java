package ch03_7;

import java.util.ArrayList;

public class S_list {
  public static void main(String[] args){
    ArrayList<String> pitches = new ArrayList();
    pitches.add("138");
    pitches.add("129");
    pitches.add("142");

    System.out.println(pitches.get(1));
    //size 아이템 갯수 리턴
    System.out.println(pitches.size());
    //contains 항목이 있는지 판별해 결과를 boolean으로 리턴
    System.out.println(pitches.contains("138"));
    //remove 값을 제거한 후 리턴 true (제거됨)
    System.out.println(pitches.remove("129"));
    System.out.println(pitches.remove(0));
    System.out.println(pitches.get(0));
  }
}
