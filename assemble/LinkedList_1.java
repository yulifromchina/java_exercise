import java.util.*;
public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("stu1");
        link.add("stu2");
        link.add("stu3");
        link.add("stu4");
        System.out.println(link.toString());

        link.add(3, "Student");
        link.addFirst("First");
        System.out.println(link);

        link.remove(3);
        link.removeFirst();
        System.out.println(link);

        System.out.println("遍历方式1");
        Iterator it = link.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("遍历方式2");
        for(Object obj:link) {
            System.out.println(obj);
        }
    }
}