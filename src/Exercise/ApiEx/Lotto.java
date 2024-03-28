package Exercise.ApiEx;

import java.util.Random;

public class Lotto {
  public static void main(String[] args) {
    LottoMachine machine = new LottoMachine();

    int[] numbers = machine.getLottoNumbers();

    System.out.print("생성 번호: ");
    for (int i : numbers) {
      System.out.printf("%d ", i);
    }
  }
}

class LottoMachine {
  private int[] LottoNumbers;
  private Random generator;

  public LottoMachine() {
    LottoNumbers = generate();
  }

  public int[] generate() {
    int[] pickedNumbers = new int[6];
    Random rand = new Random();
    for (int i = 0; i < pickedNumbers.length; i++) {
      pickedNumbers[i] = rand.nextInt(45) + 1;
    }
    return pickedNumbers;
  }
  public int[] getLottoNumbers() {
    return LottoNumbers;
  }
}

