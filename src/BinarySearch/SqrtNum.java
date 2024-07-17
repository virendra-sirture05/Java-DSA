package BinarySearch;

public class SqrtNum {
    static int sqrt(int x){
        // return (int)Math.sqrt(x); // Newton raphson mathod 

        // long start = 0;
        // long end = x;
        // range will be exceeded by using int
        // while(start <= end){
        //     long mid = start + (end - start)/2;
        //     if(mid*mid == x){
        //         return (int)mid;
        //     }
        //     else if(mid*mid > x){
        //         end = mid - 1;
        //     }
        //     else {
        //         start = mid + 1;
        //     }
        // }

        int start = 0;
        int end = x;

        while(start <= end){

            if(x<=1) return x;
                int mid = start + (end - start)/2;
                if(mid == x/mid){
                    return mid;
                }
                else if(mid > x/mid){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        return end;
    }
    public static void main(String[] args) {
        int x = 1;
        System.out.println(sqrt(x));
    }
}
