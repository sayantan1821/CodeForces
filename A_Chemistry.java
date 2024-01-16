import java.util.*;

public class A_Chemistry {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            String s = scn.next();
            int np = countNonPair(s);
            if(np == k) System.out.println("YES");
            else if(np > k) {
                if(np - k == 1) System.out.println("YES");
                else System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
    static int countNonPair(String s) {
        int[] charMap = new int[26];
        for(char ch : s.toCharArray()) {
            int charInt = ch - 'a';
            charMap[charInt]++;
        }
        int np = 0;
        for(int freq : charMap) if(freq % 2 != 0) np++;
        return np;
    }
}