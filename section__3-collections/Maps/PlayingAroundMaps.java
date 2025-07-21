package Maps;

import java.util.HashMap;
import java.util.Map;

class HashMapMethods{
    public void common(){

        Map<Integer, String> map = new HashMap<>();

        System.out.println("I am empty: "+ map);

        map.put(1, "User");
        map.put(2, "User");
        System.out.println("After adding first entry: "+map);

        // Interating over all keys of a map
        System.out.println("Displaying stored keys: ");
        for (int k: map.keySet()){
            System.out.print(k + " ");
        }
        System.out.println();
    }
}

public class PlayingAroundMaps {

    public static void main(String[] args) {
        HashMapMethods hmm = new HashMapMethods();
        hmm.common();
    }
}
