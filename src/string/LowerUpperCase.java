package string;

public class LowerUpperCase {
    public static void main(String[] args) {
        String str = "My name is Virendra";
        // str.toLowerCase();  nothing will happen
        // System.out.println(str);

        // System.out.println(str.toLowerCase());  for temporary

        // str = str.toLowerCase();  //  permanent
        // System.out.println(str);

        // str = str.toUpperCase();  // permanent
        // System.out.println(str);

        // concat()

        String aa = "abc";
        String bb = "bbc";

        aa.concat(bb); // nothing

        System.out.println(aa.concat(bb));  // temporary

        aa = aa.concat(bb);  // permanent
        System.out.println(aa);
    


    }
}
