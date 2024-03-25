package Exercise.Tclass;
//주어진 코드로 a에서 b로 계좌 이체를 하려 한다.
//main()메소드는, 매회 3천원씩 더 송금할 수 없을 때까지, 이체를 진행하는 시나리오이다.
//transfer()메소드를 완성하고, 출력 예와 같은 결과를 얻으시오.

//Account { num: 123-45, balance: 1000}
//Account { num: 567-89, balance: 19000}
public class Ex7 {
  public static void main(String[] args) {
    // Account 클래스 생성해야됌
    Account a = new Account("123-45", 10000);
    Account b = new Account("567-89", 10000);

    boolean result = true;
    while (result) {
      result = a.transfer(b, 3000);
    }
    System.out.println(a.toString());
    System.out.println(b.toString());
  }
}

class Account {
  String num;
  int balance;

  public Account(String str, int i) {
    num = str;
    balance = i;
  }

  public String toString() {
    return String.format("Account { num: %s, balance: %d}", num, balance);
  }

  public boolean transfer(Account target, int amount) {
    if (balance < amount) {
      return false;
    }
    balance -= amount;
    target.balance += amount;
    return true;
  }
}
