package Day05.collection;

import java.util.*;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Integer>hashset=new HashSet<>();
        TreeSet<Integer>treeset=new TreeSet<>();
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(265);
        hashSet.add(1);
        hashSet.add(1031);
        hashSet.add(1031);

        System.out.println(hashSet.remove(2));

    }
}
