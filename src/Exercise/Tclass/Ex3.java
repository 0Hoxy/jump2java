package Exercise.Tclass;

public class Ex3 {
  // 주어진 코드의 Miner는 코인 채굴 객체를 위한 클래스이다. 출력 예와 같은 결과를 얻도록, 코드를 완성하시오.
  // Miner {name: 말런, coin:3}
  // Miner {name: 글로리아, coin:2}

  public static void main(String[] args) {
    Miner malon = new Miner("말런");
    Miner gloria = new Miner("글로리아");

    mineCoins(malon, 3);
    mineCoins(gloria, 2);

    System.out.println(malon);
    System.out.println(gloria);
  }

  private static void mineCoins(Miner miner, int numCoins) {
    for (int i = 0; i < numCoins; i++) {
      miner.mine();
    }
  }

  static class Miner {
    String name;
    int coins;

    public Miner(String str) {
      name = str;
      coins = 0;
    }

    public String toString() {
      return String.format("Miner { name: %s, coin: %d }", name, coins);
    }

    public void mine() {
      coins += 1;
    }
  }
}
