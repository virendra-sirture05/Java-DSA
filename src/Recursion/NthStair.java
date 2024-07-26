package Recursion;

public class NthStair {

    static int stair2(int n){
        if(n<0) return 0;
        if(n==1) return 1;
        if(n==3) return 2;
        return stair2(n-1) + stair2(n-3);
    }
    // 1 and 2 jump
    static int stair(int n){
        if(n== 1 || n== 2){
            return n;
        }
        return stair(n-1) + stair(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        // System.out.println(stair(n));
        System.out.println(stair2(n));
    }
}
