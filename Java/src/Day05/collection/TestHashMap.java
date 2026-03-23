package Day05.collection;

import org.w3c.dom.ls.LSOutput;
import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
    HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(15,"prati");
        hashMap.put(12,"vijay");
        hashMap.put(1,"ashish");
        System.out.println(hashMap.put(2,"priti"));
        System.out.println(hashMap.put(83,"Pranay"));
        System.out.println(hashMap.put(23,"Anhad"));
        System.out.println(hashMap);
    }
}
