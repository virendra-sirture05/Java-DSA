package string;

import java.util.Scanner;
// vvvvv imporant question for interview
public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // aabbacde
        int[] freq = new int[26];
        // a->0 b->1 c->2 

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = (int)ch -97;
            freq[idx]++;
        }

        int max = -1;
        for(int i = 0; i<freq.length; i++){
            max = Math.max(max, freq[i]);
        }

        for(int i = 0; i<freq.length; i++){
            if(max == freq[i]){
                int idx = i + 97;
                char ch = (char)idx;
                System.out.println(ch);
            }
        }
    }
}
