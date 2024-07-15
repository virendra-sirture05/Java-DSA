package string;

public class StringComprehension {

    // optimized kaam using stringBuilder
    static int compress1(char[] arr){
        StringBuilder ans = new StringBuilder("");
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if(arr[j] == arr[i]) j++;
            else {
                ans.append(arr[i]);
                int len = j-i;
                if(len>1) ans.append(len);
                i = j;
            }
        }
        ans.append(arr[i]);
        int len = j-i;
        if(len>1) ans.append(len);

        System.out.println(ans);
        return ans.length();
    }


    // bekar kaam using string
    // static int compress(char[] arr){
    //     String ans = "";
    //     int i = 0;
    //     int j = 0;
        
    //     while (j<arr.length) {
    //         if(arr[j] == arr[i]) j++;
            
    //         else {
    //             ans += arr[i];
    //             int len = j-i;
    //             if(len>1) ans += len;
    //             i = j;
    //         }
    //     }
    //     ans += arr[i];
    //     int len = j-i;
    //     if(len>1) ans += len;
    //     System.out.println(ans);
    //     return ans.length();
    // }
    public static void main(String[] args) {
        String s = "aaaabbbccdeeff";
        //          a4b3c2de2f2
        char[] arr = s.toCharArray();

        // compress(arr);
        int ans = compress1(arr);
        System.out.println(ans);

       
    }
}
