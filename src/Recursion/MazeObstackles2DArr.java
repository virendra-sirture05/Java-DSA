package Recursion;

public class MazeObstackles2DArr {

    int maze(int[][] arr,int row, int col){
        if(row == arr[col].length-1 || col == arr[row].length-1){
            return 1;
        }

        if(arr[row][col] != -1){
            return maze(arr, row+1,col) + maze(arr, row, col+1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            { 0, 0, 0, 0 },
            { 0, -1, 0, 0 },
            {-1, 0, 0, 0 },
            { 0, 0, 0, 0 }
        };
        
        MazeObstackles2DArr m1 = new MazeObstackles2DArr();
        System.out.println(m1.maze(arr, 0, 0));
    }
}
