package string;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I am virendra sirture");

        int n = sb.length();
        int i = 0;
        int j = 0;
        while (j<n) {
            
            if(sb.charAt(j) != ' '){
                j++;
            }
            else {
                reverse(sb, i, j-1);
                i = j + 1;
                j = i;
            }
        }
        System.out.println(sb);
    }

    static void reverse(StringBuilder str,int i, int j) {
        int start = i;
        int end = j;
        while (start <= end) {
            char ch = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end, ch);
            start++;
            end--;
        }
    }
}
