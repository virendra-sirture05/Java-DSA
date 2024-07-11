package string;
import java.util.Scanner;
public class StringToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 65 && ascii <= 90){
                ascii += 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
            else{
                ascii -= 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
        }

        System.out.println(sb);
    }
}