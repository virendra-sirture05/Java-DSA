package Recursion;

public class PreInPost {
    static void pip(int n){
        if(n==0) return;
        System.out.println("pre "+n);
        pip(n-1);
        System.out.println("in "+n);
        pip(n-1);
        System.out.println("post "+n);
    }
    public static void main(String[] args) {
        int n = 3;
        pip(n);
    }
}
