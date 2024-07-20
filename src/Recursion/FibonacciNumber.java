package Recursion;

public class FibonacciNumber {
    static int fibo(int n){
        if(n<= 1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibo(n));
    }
}
