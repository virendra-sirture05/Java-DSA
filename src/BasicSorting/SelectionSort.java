package BasicSorting;
public class SelectionSort {
    static void print(int[] arr){
        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void selection(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = i; j<n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }
            // swap
            swap(arr, i, mindx);
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,3,5,32,2,5};
        print(arr);
        selection(arr);
        print(arr);

    }
    
}
