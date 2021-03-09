package haci.com;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<String> set=new HashSet();
        set.add("Mardin");
        set.add("Athen");
        set.add("İstanbul");
        set.add("Berlin");
        set.add("Oslo");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        boolean found = set.contains("Oslo");        //true
        System.out.println(found);
    }
}
