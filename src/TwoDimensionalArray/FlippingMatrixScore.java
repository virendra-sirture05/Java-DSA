package TwoDimensionalArray;
public class FlippingMatrixScore {
    
    static void print(int[][] arr ){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {
            {0,1,0,1},
            {1,0,1,0},
            {1,1,0,0}
        };
        int m = arr.length-1;
        int n = arr[0].length-1;
        for(int i = 0; i<=m; i++){
            if(arr[i][0]==0){
                for(int j = 0; j<=n; j++){
                    if(arr[i][j]==0){
                        arr[i][j] = 1;
                    }
                    else{
                        arr[i][j] = 0;
                    }
                }
            }
        }
        print(arr);

        for(int j = 1; j<=n; j++){
            int noOfZeroes = 0; int noOfOnes = 0;
            for(int i = 0; i<=m; i++){
                if(arr[i][j]==0) noOfZeroes++;
                else noOfOnes++;
            }

            if(noOfZeroes > noOfOnes){
                for(int i =0; i<=m; i++){
                    if(arr[i][j]==0) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
            
        }
        print(arr);

        int score = 0;
        int x = 1;
        for(int j = n; j>=0; j--){
            for(int i = 0; i<=m; i++){
                score += (arr[i][j] * x);
            }
            x *=2;
        }
        System.out.println(score);
        
    }
}
