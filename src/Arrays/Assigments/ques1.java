package Arrays.Assigments;

public class ques1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        product(arr);
    }
    static void product(int[] arr){
        int product = 1;
        for(int i = 0; i<arr.length; i++){
            product*= arr[i];
        }
        System.out.println(product);
    }
}
