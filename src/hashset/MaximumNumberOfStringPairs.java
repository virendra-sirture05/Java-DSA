package hashset;

import java.util.HashSet;

public class MaximumNumberOfStringPairs {
    static int maximumString(String[] words){
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i<words.length; i++){
            String rev = reverse(words[i]);
            if(set.contains(rev)){
                count++;
            }
            else set.add(words[i]);
        }
        return count;
    }

    static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] words = {"cd","ca","dc","ac","zz"};
        System.out.println(maximumString(words));
    }
}
