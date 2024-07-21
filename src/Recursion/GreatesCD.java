package Recursion;

public class GreatesCD {

    static int hcf(int a, int b){       // TC -> O(min(a,b))
        for(int i = Math.min(a, b); i>=1; i--){
            if(a%i ==0 && b%i == 0){
                return i;
            }
        }
        return 1;
    }

    static int gcd(int a, int b){    // TC-. O(log(min(a,b)))
        if(b%a == 0) return a;
        return gcd(b%a, a);
    }
    public static void main(String[] args) {
        int a = 24;
        int b = 60;
        System.out.println(hcf(a, b));
        System.out.println(gcd(a, b));
    }
}
