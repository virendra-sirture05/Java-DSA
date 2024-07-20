package Recursion;
// time commlextity -> O(b)
public class PowerLinear {
    static int pow(int a, int b){
        if(b == 0){
            return 1;
        }

        return a * pow(a, b-1);
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        System.out.println(pow(a, b));
    }
}
