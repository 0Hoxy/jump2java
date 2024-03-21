package ch03_7;

import java.util.ArrayList;
import java.util.Arrays;
public class arrayList {
  public static void main(String[] args) {
    String[] data = {"138","129","142"};
    ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
    System.out.println(pitches);

    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3));
    System.out.println(nums);
  }
}
