import java.util.*;

public class A_Increasing_and_Decreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            int n = scn.nextInt();
            int[] ar = new int[n];
            ar[0] = x;
            ar[n - 1] = y;
            int b = 1;
            boolean isPossible = true;
            for (int i = n - 2; i > 0; i--) {
                if (ar[i + 1] - b > ar[0] && ar[i + 1] - b - ar[0] > b) {
                    ar[i] = ar[i + 1] - b;
                    b++;
                } else {
                    isPossible = false;
                    System.out.println(-1);
                    break;
                }
            }
            if (isPossible) {
                for (int num : ar)
                    System.out.print(num + " ");
                System.out.println();
            }
        }
    }
}