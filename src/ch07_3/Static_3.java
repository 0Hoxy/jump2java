package ch07_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Static_3 {

  public static void main(String[] args) {
    System.out.println(Util.getCurrentDate("yyyyMMdd"));
  }
}

class Util {
  public static String getCurrentDate(String fmt) {
    SimpleDateFormat sdf = new SimpleDateFormat(fmt);
    return sdf.format(new Date());
  }
}
