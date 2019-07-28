import java.util.*;
public class treeSet_1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Jack");
        ts.add("Hello");
        ts.add("Hello");
        ts.add("Eve");
        for(Object obj: ts) {
            System.out.println(obj);
        }
    }
}