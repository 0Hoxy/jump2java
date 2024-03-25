package Exercise.Tclass;

//V(부피)=length*length*length
//S(겉넓이)=6*length*length
/* 출력 예
    정육면체 a의 부피: 27, 겉넓이:54
    정육면체 b의 부피: 125, 겉넓이:150 */
public class Ex4 {
  public static void main(String[] args) {
    Cube a = new Cube(3);
    Cube b = new Cube(5);

    System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d%n", a.Volume(), a.SurfaceArea());
    System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d", b.Volume(), b.SurfaceArea());
  }
}

class Cube {
  int length;

  public Cube(int i) {
    length = i;

  }

  public int Volume() {
    return length * length * length;
  }

  public int SurfaceArea() {
    return 6 * length * length;
  }
}

