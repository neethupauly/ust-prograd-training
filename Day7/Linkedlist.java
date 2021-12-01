package list;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("apple");
        linkedlist.add("orange");
        linkedlist.add("kiwi");
        linkedlist.add("plum");
        System.out.println(linkedlist);
        linkedlist.remove(3);
        System.out.println(linkedlist);
        linkedlist.forEach(fruits -> System.out.println(fruits));
        System.out.println(linkedlist.lastIndexOf("kiwi"));
        linkedlist.set(2,"ripe banana");
        linkedlist.forEach(fruits -> System.out.println(fruits));

    }
}
