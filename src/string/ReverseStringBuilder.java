package string;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("virendra");

        int start = 0; 
        int end = sb.length()-1;
        while (start <= end) {
            char ch = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end, ch);
            start++;
            end--;
        }
        System.out.println(sb);
    }
}
