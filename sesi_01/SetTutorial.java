import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTutorial {
    public static void main(String[] args) {
        //Inisiasi HashSet
        Set<String> set1 = new HashSet<>();
        set1.add("Hello");

        //Inisiasi TreeSet
        Set<String> set2 = new TreeSet<>();
        set2.add("World");

        //Inisiasi LinkedHashSet
        Set<String> set3 = new LinkedHashSet<>();
        set3.add("Welcome");

    }
}
