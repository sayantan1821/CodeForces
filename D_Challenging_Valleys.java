import java.util.*;

public class D_Challenging_Valleys {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i < n; i++) {
                ar[i] = scn.nextInt();
            }
            int l = 0;
            while(l < n - 1 && ar[l] >= ar[l + 1]) l++;
            while(l < n - 1 && ar[l] <= ar[l + 1]) l++;
            System.out.println(l == n - 1 ? "YES" : "NO");
        }
    }
}