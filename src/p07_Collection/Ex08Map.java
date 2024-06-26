package p07_Collection;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// "비밀번호는 같을 수 있으나 아이디는 같을 수 없다." 로 이해하기
public class Ex08Map {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap();
    map.put("admin", "1");
    map.put("user", "1");
    if (map.containsKey("member") == false) map.put("member", "1");
    if (!map.containsKey("member")) map.put("member", "2");
    map.put("member", "3"); // 기존 key가 중복 될 경우 덮어씀.
    System.out.println(map);

    // 지울때는 key값 remove
    map.remove("admin");
    System.out.println(map);

    // 1) key와 value를 동시에 접근
    Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry entry = (Map.Entry) it.next();
      System.out.printf(
          "k : %s , v :%s \n", entry.getKey(), entry.getValue());
    }
    System.out.println();
    // 2) key 로 접근
    it = map.keySet().iterator();
    while (it.hasNext()) {
      String key = (String) it.next();
      String value = map.get(key);

      System.out.printf("k : %s , v : %s \n" , key,value);

    }
    // 3) value 로 접근
    it = map.values().iterator();
    while (it.hasNext()) {
      String value = (String) it.next();
      System.out.printf(" "+value);
    }
  }
}
