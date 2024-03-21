package ch05_6;

class Animal {
  public Animal(String name) {
    this.name = name;
  }

  String name;
  int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    }
  }



public class constructorOverloading {
  public static void main(String[] args) {
    Animal ani1 = new Animal();
    Animal ani2 = new Animal("애니2");
    System.out.println(ani2.name);
    Animal ani3 = new Animal ("애니3", 17);

    Dog dog = new Dog();
  }
}
