package Recursion;

public class PrintSum {
    static int print(int n){
        if(n == 0){
            return n;
        }
        int smallAns = print(n-1);
        return smallAns + n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(print(n));
    }
}
