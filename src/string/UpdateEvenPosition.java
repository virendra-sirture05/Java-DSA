package string;

public class UpdateEvenPosition {
    public static void main(String[] args) {
        String str = "how are you?";
        String up = "";

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(i%2==0){
                up += "a";
            }
            else up +=ch;
        }
        System.out.println(up);
    }
}
