package Recursion;

public class ArrayTraversal {
    static void traverse(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+" ");
        traverse(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        traverse(arr, 0);
    }
}
