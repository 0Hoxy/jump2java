package ch05;

class Cat{
  void crying(){
    System.out.println("애옥!");
  }
}

class HouseCat extends Cat {
  void crying(){
    System.out.println("미야옹~");
  }
}
class RoadCat extends Cat{
  void crying(){
    System.out.println("키야아ㅏㅏ아아");
  }
}

public class methodOverriding {
  public static void main(String[] args) {
    HouseCat cat1 = new HouseCat();//집냥이
    RoadCat cat2 = new RoadCat();//길냥이

    cat1.crying();
    cat2.crying();
  }
}
