import java.util.*;

public class D_Very_Different_Array {
    static int maxDiff;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            maxDiff = Integer.MIN_VALUE;
            int n = scn.nextInt(), m = scn.nextInt();
            int[] a = new int[n], b = new int[m];
            for(int i = 0; i < n; i++) a[i] = scn.nextInt();
            for(int i = 0; i < m; i++) b[i] = scn.nextInt();

            for(int i = 0; i < n; i++) findMaxDiff(a, b, i, 0);
            System.out.println(maxDiff);
        }
        
    }
    static void findMaxDiff(int[] a, int[] b, int idx, int diff) {
        if(idx == a.length) {
            maxDiff = Math.max(maxDiff, diff);
            return;
        }
        for(int i = 0; i < b.length; i++) {
            if(b[i] != -1) {
                int temp = b[i];
                b[i] = -1;
                findMaxDiff(a, b, idx + 1, diff + Math.abs(a[idx] - temp));
                b[i] = temp;
            }
        }
    }
}    