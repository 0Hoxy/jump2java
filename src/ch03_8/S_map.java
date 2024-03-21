package ch03_8;

import java.util.HashMap;

public class S_map {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    //map은 key와 value로 사용 인덱스가 없음.
    map.put("people", "사람");
    map.put("baseball","야구");
    map.put("cat","고양이");
    //put("key","value")로 추가하기
    System.out.println(map.get("people"));
    //get("key")로 value를 꺼냄
    System.out.println(map.containsKey("people"));
    //containsKey("key") 키가 있으면 참, 없으면 거짓
    System.out.println(map.remove("people"));
    //remove("key")로 삭제하고 value가 리턴
    System.out.println(map.size());
    //size()는 맵 요소의 개수를 리턴
    System.out.println(map.keySet());
    //keySet()는 맵의 모든 key를 모아서 리턴
    System.out.println(map.values());
    //values()는 맵의 모든 value를 모아서 리턴


  }
}
