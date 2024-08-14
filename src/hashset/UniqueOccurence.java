package hashset;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurence {
    static boolean unique(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int elem : arr){
            if(map.containsKey(elem)){
                int freq = map.get(elem);
                map.put(elem, freq + 1);
            }
            else{
                map.put(elem, 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int key : map.keySet()){
            set.add(map.get(key));
        }
        return set.size()== map.size();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(unique(arr));
    }
}
