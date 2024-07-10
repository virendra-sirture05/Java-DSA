package TwoDimensionalArray;

import java.util.Scanner;

public class BasicOfTwoDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];

        int n = arr.length;
        int m = arr[0].length;
        System.out.println(n+" "+m);

        for(int r = 0; r<arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                arr[r][c] = sc.nextInt();
            }
        }

        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
}
