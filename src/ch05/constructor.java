package ch05;

class Animal {
  String name;

  void setName(String name){
    this.name = name;
  }
}
class Dog extends Animal{

}
public class constructor {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();
  }
}
