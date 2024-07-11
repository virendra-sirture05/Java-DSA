package string;

import java.util.Scanner;

public class CountVowel {
    static void count(String str){
        int n = str.length();
        int count = 0;
        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);
            if(isVowel(ch)==true) count++;
        }
        System.out.println(count);
    }
    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'A') return true;
        if(ch == 'e' || ch == 'E') return true;
        if(ch == 'i' || ch == 'I') return true;
        if(ch == 'o' || ch == 'O') return true;
        if(ch == 'u' || ch == 'U') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str = sc.nextLine();
        count(str);
    }
}
