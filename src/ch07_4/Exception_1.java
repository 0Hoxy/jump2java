package ch07_4;

class Fool2Exception extends Exception {
}
public class Exception_1 {
  public void sayNick(String nick) {
    try {
      if ("바보".equals(nick)) {
        throw new Fool2Exception();
      }
      System.out.println("당신의 별명은 " + nick + "입니다.");
    } catch (Fool2Exception e) {
      System.err.println("FoolException이 발생했습니다.");
    }
  }

  public static void main(String[] args) {
    Exception_1 exception = new Exception_1();
    exception.sayNick("바보");
    exception.sayNick("야호");
  }
}
//트랜젝션(transaction)은 try catch 처럼 묶어서 한번에 처리하게 하는것
