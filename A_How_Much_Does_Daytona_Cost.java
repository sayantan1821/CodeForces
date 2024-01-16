import java.util.*;

public class A_How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] ar = new int[n];
            boolean ans = false;
            for(int i = 0; i < n; i++) {
                ar[i] = scn.nextInt();
                if(ar[i] == k) ans = true;
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }
}