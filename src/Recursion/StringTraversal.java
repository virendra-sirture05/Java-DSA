package Recursion;

public class StringTraversal {
    static void print(String s, int idx){
        if(idx == s.length()) return;
        System.out.print(s.charAt(idx));
        print(s, idx+1);
    }
    static void skip(String s, int idx, String ans){
        if(idx == s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(idx) != 'a'){
            ans += s.charAt(idx);
        }
        skip(s, idx+1, ans);
    }
    public static void main(String[] args) {
        String s = "abbacads";
        print(s, 0);
        skip(s, 0, " ");

    }
}
