package Recursion;

public class NthStair {
    static int stair(int n){
        if(n== 1 || n== 3){
            return n;
        }
        return stair(n-1) + stair(n-3);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(stair(n));
    }
}
