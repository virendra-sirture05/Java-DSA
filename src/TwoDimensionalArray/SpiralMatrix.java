package TwoDimensionalArray;
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2, 3, 4},
            {5,6, 7, 8},
            {9,10,11,12},
            {13,14,15,16}
        };
        List<Integer> ans = spiral(arr);
        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    static List<Integer> spiral(int[][] arr){
        int m = arr.length-1;
        int n = arr[0].length-1;
        
        int minc = 0;
        int maxc = m;
        int minr = 0;
        int maxr = n;

        List<Integer> ans = new ArrayList<>();
        while(minc <= maxc && minr<= maxr){
            //left to right
            for(int j = minc; j <= maxc; j++){
                ans.add(arr[minr][j]);
            }
            minr++;
            for(int i = minr; i <= maxr; i++){
                ans.add(arr[i][maxc]);
            }
            maxc--;
            for(int j = maxc; j>=minc; j--){
                ans.add(arr[maxr][j]);
            }
            maxr--;
            for(int i = maxr; i>=minr; i--){
                ans.add(arr[i][minc]);
            }
            minc++;

        }
        return ans;
    }
}
