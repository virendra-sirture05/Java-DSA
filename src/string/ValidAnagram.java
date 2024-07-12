package string;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "virendra";
        String t = "revindra";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t){
        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        for(int i = 0; i<ch.length; i++){
            if(ch[i] != ch1[i]) return false;
        }
        return true;
    }
}
