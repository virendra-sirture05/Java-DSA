package Recursion;

public class PrintIncreasing {
    static void print(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
