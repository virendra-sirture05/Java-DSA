package string;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String s = "virendra";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (char elem : ch) {
            System.out.print(elem);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("irendra");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
