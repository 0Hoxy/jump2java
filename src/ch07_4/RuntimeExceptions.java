package ch07_4;

class FoolException extends RuntimeException{
}

public class RuntimeExceptions {
  public void sayNick(String nick) {
    if ("바보".equals(nick)) {
      throw new FoolException();
    }
    System.out.println("당신의 별명은 " + nick + "입니다.");
  }

  public static void main(String[] args) {
    RuntimeExceptions sample = new RuntimeExceptions();
    try {
      sample.sayNick("바보");
      sample.sayNick("야호");
    } catch (FoolException e) {
      System.err.println("FoolException이 발생했습니다.");
    }
  }
}
