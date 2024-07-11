package string;

import java.util.Scanner;

public class StringBuilderInjava {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("abcde");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());

        // StringBuilder sb1 = new StringBuilder(10);
        // System.out.println(sb1.capacity());
        // System.out.println(sb1.length());
        // System.out.println(sb1);

        // System.out.println(sb.reverse());
        // // Input 
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // StringBuilder ss = new StringBuilder(s);
        // System.out.println(ss);


        // we can update in strng builder
        StringBuilder a = new StringBuilder("Virendra");
        a.setCharAt(1, 'V');
        System.out.println(a);

    }
}
