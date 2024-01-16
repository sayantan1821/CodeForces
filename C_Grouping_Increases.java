import java.util.*;

public class C_Grouping_Increases {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
            }
            int b = Integer.MAX_VALUE, c = Integer.MAX_VALUE, ans = 0;
            for(int num : a) {
                if(b > c) {
                    int temp = c;
                    c = b;
                    b = temp;
                }

                if(num <= b) b = num;
                else if(num <= c) c = num;
                else {
                    b = num;
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}