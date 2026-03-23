package Day05.collection;

import Day01.Main.Main;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {

    ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(103);
        arrayList.add(104);

        Iterator<Integer> iterator = arrayList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());

    }
    }
}
