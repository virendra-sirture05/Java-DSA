package Recursion;

public class BinaryString {
    static void printString(String ans, int n){
        int m = ans.length();
        if(m==n){
            System.out.println(ans);
            return;
        }
        if(m == 0 || ans.charAt(m-1) == '0'){
            printString(ans+0,n);
            printString(ans+1, n);
        }
        else{
            printString(ans+0, n);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printString("",n);
    }
}
