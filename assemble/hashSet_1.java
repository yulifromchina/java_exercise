import java.util.*;

public class hashSet_1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Jack");
        set.add("Eve");
        set.add("Rose");
        set.add("Rose");
        for(Object obj: set) {
            System.out.println(obj);
        }
    }
}