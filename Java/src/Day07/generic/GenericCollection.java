package Day07.generic;

import java.util.ArrayList;

public class GenericCollection {
    public static void main(String[] args) {
        ArrayList<String> ptya = new ArrayList<>();
        ptya.add("46");
//-----------------------------------------------------------------------
        //ptya.add(7);              //NOT POSSIBLE
//-----------------------------------------------------------------------
        ArrayList ptya1 = new ArrayList<>();

        ptya1.add(6);
        ptya1.add("6");

        System.out.println(ptya1);
    }

}
