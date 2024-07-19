package Recursion;

public class printSum1 {
    static void sum(int n, int s){
        if(n == 0){
            System.out.println(s);
            return;
        }
        sum(n-1, n+s);
    }
    public static void main(String[] args) {
        int n = 5;
        sum(n, 0);
    }
}
