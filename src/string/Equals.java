package string;

public class Equals {
    public static void main(String[] args) {

        // == 
        // String a = "abcd";
        // String b = "abcd";
        // System.out.println(a==b);

        // String c = "ab";
        // c = c + "cd";
        // System.out.println(a==c);

        // String d = new String(a);
        // System.out.println(a==d);

        // .equals 

        // System.out.println(a.equals(b));
        // System.out.println(a.equals(c));
        // System.out.println(a.equals(d));

        String name = new String("Virendra");
        String name2 = new String("Virendra");
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
    }
}
