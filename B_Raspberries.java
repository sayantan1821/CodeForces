import java.util.*;

public class B_Raspberries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[n];
            int max = 0;
            for(int i = 0; i < n; i++) {
                int num = scn.nextInt();
                if(num % k == 0) {
                    System.out.println(0);
                    max = -1;
                    break;
                }
                if(num % k > max) max = Math.max(max, num % k);
            }
            if(max != -1) System.out.println(k - max);
        }
    }
}