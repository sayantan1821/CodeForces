import java.util.*;

public class A_MEXanized_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int x = scn.nextInt();
            long sum = 0;
            if(k > n || x < k - 1) {
                System.out.println(-1);
            } else {
                if(x == k) x = x -1;
                for(int i = 0; i < k; i++) sum = sum + i;
                for(int i = k; i < n; i++) sum = sum + x;
                System.out.println(sum);
            }
        }
    }
}