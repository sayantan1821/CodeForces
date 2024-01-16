import java.util.*;

public class B_Aleksa_and_Stack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] ar = new int[n];
            ar[0] = 1;
            ar[1] = 3;
            for(int i = 2; i < n; i++) ar[i] = ar[i - 1] + ar[i - 2] + 1;
            for(int num : ar) System.out.print(num + " ");
            System.out.println();
        }
    }
}