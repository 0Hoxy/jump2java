package ch06_1;

import java.io.IOException;
import java.io.InputStream;

public class InputStream_ {

  public static void main(String[] args) throws IOException {
    InputStream in = System.in;

    int a;
    int b;
    int c;

    a = in.read(); //콘솔에서 받은 입력을 input에 대입
    b = in.read(); //콘솔에서 받은 입력을 input에 대입
    c = in.read(); //콘솔에서 받은 입력을 input에 대입

    //int 변수는 4바이트를 차지하지만 in.read() 메소드는 1byte 씩 데이터를 읽어들인다. 그러나 in.read() 메소드는 StreamInput으로부터 읽어들인 데이터를 int로 반환한다. 따라서 in.read() 메소드가 반환하는 1byte 크기의 데이터를 int 변수에 저장하면, 이 1byte 데이터는 int의 4byte 공간에 저장됩니다.
    //이때 부호 확장이 발생하여, byte의 부호를 나타내는 1byte의 값이 4byte int로 변환됩니다.


    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

  }
}
//콘솔이랑 사용자가 출력된 질문에 키보드로 답변을 입력하는 것
// 사용자가 입력한 문자열을 얻으려면 System.in을 사용해야 한다.
/*
 InputStream
 - Byte 단위의 데이터를 읽어 들일 때 사용하는 내장 클래스
 - InputStream의 read 메서드는 1byte만 읽어 아스키코드값으로 출력한다.
 - InputStream(입력 스트림)은 사용자가 전달한 데이터. byte의 흐름을 추상화한 개념이며 데이터를 byte 단위로 다룬다.
 */