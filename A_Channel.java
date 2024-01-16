import java.util.*;

public class A_Channel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int a = scn.nextInt();
            int q = scn.nextInt();
            String strQ = scn.next();
            int countP = 0;
            for (char ch : strQ.toCharArray()) {
                if (ch == '+') countP++;
            }
            if (countP + a < n) {
                System.out.println("NO");
            }
            else {
                int uniqSub = 0, maxUniq = 0;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
                if(a >= n) {System.out.println("YES"); continue;}
                for (char ch : strQ.toCharArray()) {
                    
                    if (ch == '+') uniqSub++;
                    else uniqSub--;
                    if(a + uniqSub >= maxUniq) maxUniq = a + uniqSub;                  
                }
                if(maxUniq >= n) System.out.println("YES");
                else System.out.println("MAYBE");
            }
        }
    }
}