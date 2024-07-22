package Recursion;
public class CountAndSay {
    static String countSay(int n){
        if(n== 1){
            return "1";
        }
        String s = countSay(n-1) ;
        String ans = "";
        int i = 0;
        int j = 0;
        while (j< s.length()) {
            if(s.charAt(i) == s.charAt(j)) j++;
            else{
                int len = j-i;
                ans += len;
                ans += s.charAt(i);
                i =j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 222331115;
        System.out.println(countSay(n));
    }
}
