package ch07_4;

public class Throws1 {
  public void sayNick(String nick) throws FoolException {
    if ("바보".equals(nick)) {
      throw new FoolException();
    }
    System.out.println("당신의 별명은 " + nick + "입니다.");
  }

  public static void main(String[] args) {
    Throws1 throws1 =new Throws1();
    try {
      throws1.sayNick("바보");
      throws1.sayNick("야호");
    } catch (FoolException e) {
      System.err.println("FoolException이 발생했습니다.");
    }
  }
}

