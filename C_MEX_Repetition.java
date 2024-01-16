import java.util.*;

public class C_MEX_Repetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n, k, mex = -1;
            n = scanner.nextInt();
            k = scanner.nextInt();
            int[] a = new int[n + 1];
            int[] b = new int[n + 1];
            
            for (int i = 1; i <= n; i++) {
                int f = scanner.nextInt();
                a[i] = f;
                b[f]++;
            }
            
            for (int i = 0; i <= n; i++) {
                if (b[i] == 0) {
                    mex = i;
                    break;
                }
            }
            
            a[0] = mex;
            k = k % (n + 1);
            
            for (int i = 0; i <= n; i++) {
                if ((i + k) <= n) {
                    b[i + k] = a[i];
                } else {
                    b[(i + k) % (n + 1)] = a[i];
                }
            }
            
            for (int i = 1; i <= n; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}