package Recursion;
public class Permutations {
    
    static void permutation(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            permutation(left + right, ans +ch);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        permutation(s, "");
    }
}
