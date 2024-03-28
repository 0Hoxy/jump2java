package ch07_5;

import java.util.ArrayList;

public class Join extends Thread {
  int seq;

  public Join(int seq) {
    this.seq = seq;
  }

  public void run() {
    System.out.println(this.seq + "thread start.");
    try {
      Thread.sleep(1000);
    } catch (Exception e) {

    }
    System.out.println(this.seq + "thread end.");
  }

  public static void main(String[] args) {
    ArrayList<Thread> threads = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Thread t = new Join(i);
      t.start();
      threads.add(t);
    }
    for (int i = 0; i < threads.size(); i++) {
      Thread t = threads.get(i);
      try {
        t.join();
      } catch (Exception e) {
      }
    }
    System.out.println("main end.");
  }
}

