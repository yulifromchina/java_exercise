import java.util.*;

public class hashMap_1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Jack");
        map.put("2", "Rose");
        map.put("3", "Lucy");
        System.out.println(map.get("2"));
        System.out.println("---------遍历方式1----------");
       //迭代获取键和值
       Set entrySet = map.entrySet();
       Iterator it = entrySet.iterator();
       while(it.hasNext()) {
           Map.Entry entry = (Map.Entry)(it.next());
           Object key = entry.getKey();
           Object value = entry.getValue();
           System.out.println(key + ":" + value);
       }
       System.out.println("---------遍历方式2----------");
       //迭代获取值
       Collection values = map.values();
       Iterator it1 = values.iterator();
       while(it1.hasNext()) {
           Object value = it1.next();
           System.out.println(value);
       }
       System.out.println("---------遍历方式3----------");
       //迭代获取键，再获取每一个键对应的值
       Set keySet = map.keySet();
       Iterator it2 = keySet.iterator();
       while(it2.hasNext()) {
           Object key = it2.next();
           Object value = map.get(key);
           System.out.println(key + ":" + value);
       }
    }
}