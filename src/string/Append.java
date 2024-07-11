package string;

public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcd");
        sb.append(10);
        System.out.println(sb);
        sb.append('a');
        System.out.println(sb);
        sb.append("*");
        System.out.println(sb);
        char[] ch = {'v','i','r'};
        sb.append(ch);
        System.out.println(sb);

        int[] arr = {1,2,3,4};
        sb.append(arr);
        for(int elem: arr){
            sb.append(elem);
        }
        System.out.println(sb);
        sb.append(true);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("ajdfj;a");
        sb.append(sb1);
        System.out.println(sb);

        // sb += "jsfjsj"; not possible
    }
}
