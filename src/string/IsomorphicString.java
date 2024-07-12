package string;

public class IsomorphicString {
    
    static boolean isIsomorphic(String s, String t){
        char[] ch = new char[128];
        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            int idx = (int)a;
            if(ch[idx]=='\0') ch[idx] = b;
            else if(ch[idx] != b){
                return false;
            }
        }

        for(int i = 0; i<ch.length; i++){
            ch[i] = '\0';
        }
        
        for(int i = 0; i<t.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            int idx = (int)b;
            if(ch[idx]=='\0') ch[idx] = a;
            else{
                if(ch[idx] != a){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "bar";
        String t = "foo";
        System.out.println(isIsomorphic(s, t));
    }
}
