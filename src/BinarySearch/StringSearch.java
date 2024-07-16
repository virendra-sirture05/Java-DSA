package BinarySearch;

public class StringSearch {
    public static void main(String[] args) {
        String s = "abcde";
        char ch = 'c';
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ch){
                System.out.println(i);
                break;
            }
        }
    }
}
