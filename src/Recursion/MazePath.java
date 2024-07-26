package Recursion;

import java.util.Scanner;

public class MazePath{

    static int maze2(int m, int n){
        if(m==1 || n == 1){
            return 1;
        }
        return maze2(m-1, n) + maze2(m, n-1);
    }
    static int maze(int row, int col, int m, int n){
        if(row==m || col==n){
            return 1;
        }
        int rightMove = maze(row, col+1, m, n);
        int downMove = maze(row+1, col, m, n);
        return rightMove + downMove;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        // System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m, n));
    }
}