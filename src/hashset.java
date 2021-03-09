import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> Set =new HashSet<>();
        Set.add("elma");
        Set.add("armut");
        Set.add("portakal");
        Set.add("mandalin");
        Set.add("muz");
        boolean found = Set.contains("portakal");        //true
        System.out.println(found);
//5. Iterate over values
        Iterator<String> itr;
        itr = Set.iterator();

        while(itr.hasNext())
        {
            String value = itr.next();

            System.out.println("Value: " + value);
        }
    }
}
