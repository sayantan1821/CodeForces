import java.util.*;
 
public class A_Not_a_Substring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            String s = scn.next();
            if(s.equals("()")) System.out.println("NO");
            else {
                StringBuilder sb = new StringBuilder();
                for(int i = 1; i < s.length(); i = i++) {
                    if(s.charAt(i) == s.charAt(i - 1)) sb.append("()()");
                    else {}
                }
                if(s.length() % 2 == 1) sb.append("()");
                System.out.println("YES");
                System.out.println(sb);
            }
        }
    }
}