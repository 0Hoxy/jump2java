package ch04_1;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class S_if {
  public static void main(String[] args) {
    int money = 2000;
    //비교연산자
    if(money >= 3000){
      System.out.println("택시를 타고가라");
    }else{
      System.out.println("걸어가라");
    }
    //논리연산자 && || !
    boolean hasCard = true;
    if(money>=3000||hasCard){
      System.out.println("택시를 타고가라");
    }else{
      System.out.println("걸어가라");
    }
    ArrayList<String> pocket = new ArrayList<>();
    pocket.add("phone");
    pocket.add("cash");
    pocket.add("gummy");
    if(pocket.contains("cash")){
      System.out.println("택시를 타고가라");
    }else{
      System.out.println("걸어가라");
    }
    if(hasCard){
      System.out.println("택시를 타고가라");
    }else if(pocket.contains("cash")){
      System.out.println("택시를 타고가라");
    }else{
      System.out.println("걸어가라");
    }
  }
}


//