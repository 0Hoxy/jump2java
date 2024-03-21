package ch03_7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class S_generics {
  public static void main(String[] args) {
    ArrayList<String> pitches = new ArrayList<>();
    pitches.add("138");
    pitches.add("129");
    pitches.add("142");
    System.out.println(pitches);

    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    System.out.println(nums);
  }
}
