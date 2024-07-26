package Recursion;

public class CountDigits {
    static int countOfDigit(int n){
        if(n<=9 && n>=0){
            return 1;
        }
        return countOfDigit(n/10) +1;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(countOfDigit(n));
    }
}
