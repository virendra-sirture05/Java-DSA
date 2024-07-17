package TwoDimensionalArray;
public class ForEach2D {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        for(int elem : a){
            System.out.print(elem+" ");
        }
        System.out.println();

        int[][] b = {
            {1,2,3},
            {4,5,6}
        };

        for(int[] elem : b){
            for(int x : elem){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
