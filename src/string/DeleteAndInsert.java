package string;

public class DeleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.delete(1,2);
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        sb.delete(2, 04);
        System.out.println(sb);

        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(0, "p");
        System.out.println(sb);
        sb.insert(1, 0);
        System.out.println(sb);
        sb.insert(0, "virne");
        System.out.println(sb);

    }
}
