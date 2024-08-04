package AdvanceSorting;
public class MergeTwoSortedArrays{

    static void print(int[] arr){
        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    static void merge(int[] a, int[] b, int[] c){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<a.length && j<b.length) {
            if(a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            c[k++] = a[i++];
        }
        while (j<b.length) {
            c[k++] = b[j++];
        }
    }
    public static void main(String args[]){
        int[] a = {10,30,50,70};
        int[] b = {20,40,60,80};

        int[] c= new int[a.length + b.length];

        merge(a,b,c);
        print(c);
    }
}