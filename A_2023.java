import java.util.*;

public class A_2023 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            long mul = 1;
            for(int i = 0; i < n; i++) mul = mul * scn.nextInt();
            if(2023 % mul != 0) System.out.println("NO");
            else {
                System.out.println("YES");
                System.out.print(2023 / mul);
                for(int i = 0; i < k - 1; i++) System.out.print(" " + 1);
            }
            System.out.println();
        }
    }
}