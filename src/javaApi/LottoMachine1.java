package javaApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LottoMachine1 {
  public static void main(String[] args) {
    //45개의 공을 리스트로 만든다
    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= 45; i++) {
      numbers.add(i);//1~45까지 적용
    }
    //랜덤으로 섞기
    Collections.shuffle(numbers);
    //뽑기
    int[] picked = new int[6]; //배열 6개
    for (int i = 0; i < 6; i++) {
      picked[i] = numbers.get(i);
    }
    System.out.printf("자동 생성 번호: %s", Arrays.toString(picked));
  }
}
