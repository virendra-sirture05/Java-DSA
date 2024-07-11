package string;

public class PrintAllSubstring {
    static void substr(String str){
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                System.out.print(str.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "abcd"; // a ab abc abcd b bc bcd c cd d
        substr(str);
    }
}
