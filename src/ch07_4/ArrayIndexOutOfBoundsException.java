package ch07_4;

public class ArrayIndexOutOfBoundsException {

  public static void main(String[] args) {
    int[] a = {1, 2, 3};
    System.out.println(a[3]);
    //배열에서 아무것도 없는 곳을 가리켰을 때 ArrayIndexOutOfBoundsException(배열 인덱스가 범위를 벗어난 예외) 예외 발생
  }
}
