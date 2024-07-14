package BasicSorting;

public class TransformArray0toN {
    public static void main(String[] args) {
        int[] arr = {54,65,76,43,33,50};
        //            3  4  5  1  0   2 

        int x = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            
            for(int j = 0; j<n; j++){
                if(arr[j] < min && arr[j] > 0){
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }  
        
        print(arr);

        for(int i = 0; i<n; i++){
            arr[i] *= -1;
        }
        print(arr);
    }
    static void print(int[] arr){
        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
}
