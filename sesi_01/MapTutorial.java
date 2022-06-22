import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTutorial {
    public static void main(String[] args) {
        //Inisiasi HashMap
        Map<String, String> map1 = new HashMap<>();
        map1.put("Hello", "World");
        
        //Inisiasi TreeMap
        Map<String, String> map2 = new TreeMap<>();
        map2.put("Halo", "Dunia");

        //Inisiasi LinkedHashMap
        Map<String, String> map3 = new LinkedHashMap<>();
        map3.put("Selamat", "Pagi");
    }
}
