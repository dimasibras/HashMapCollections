import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> mapObj = new HashMap<>();
        mapObj.put  ("Even",
                    new ArrayList<Integer>(Arrays.asList(0, 2, 4, 6, 8)));
        mapObj.put  ("Odd",
                new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9)));

        for(HashMap.Entry<String, ArrayList<Integer>> set : mapObj.entrySet()){
            System.out.println(set.getValue()+" are included as "+set.getKey()+" number.");
        }
    }
}
