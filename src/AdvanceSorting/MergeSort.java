package AdvanceSorting;
public class MergeSort{

    static void print(int[] arr){
        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr){

        int n = arr.length;

        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i = 0; i<n/2; i++){
            a[i] = arr[i];
        }
        for(int i = 0; i<n-n/2; i++){
            b[i] = arr[i+n/2];
        }

        mergeSort(a);
        mergeSort(b);
        
        MergeTwoSortedArrays.merge(a,b,arr);
    }
    public static void main(String args[]){
        int[] arr = {40,30,50,10,80,20};

        mergeSort(arr);
        print(arr);
    }
}