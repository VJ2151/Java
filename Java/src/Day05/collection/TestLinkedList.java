package Day05.collection;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList {public static void main(String[] args) {
    LinkedList<Integer> LinkedList = new LinkedList<>();
    LinkedList<Integer> NewLinkedList = new LinkedList<>();
    LinkedList.add(101);
    LinkedList.add(102);
    LinkedList.add(103);
    LinkedList.add(104);

    NewLinkedList.add(100);
    NewLinkedList.add(200);
    NewLinkedList.add(300);

    LinkedList.addAll(2,NewLinkedList);
    System.out.println(LinkedList);

    LinkedList.remove(2);
    System.out.println(LinkedList);

    System.out.println(LinkedList);

    LinkedList.set(5,20000);
    System.out.println(LinkedList);
    System.out.println(LinkedList.getFirst());
    System.out.println(LinkedList.get(2));
    System.out.println(LinkedList.getLast());

    Collections.sort(LinkedList);
    System.out.println(LinkedList);

}
}
