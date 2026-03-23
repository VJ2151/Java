package Day05.collection;
import java.util.*;
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> newArrayList = new ArrayList<>();
        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(103);
        arrayList.add(104);

        newArrayList.add(100);
        newArrayList.add(200);
        newArrayList.add(300);

        arrayList.addAll(2,newArrayList);
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.set(5,20000);
        System.out.println(arrayList);


    }
}
