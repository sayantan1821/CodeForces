import java.util.*;

public class D_Sorting_By_Multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i < n; i++) {
                ar[i] = scn.nextInt();
            }
            int operation = 0;
            int[][] te = new int[n][2];
            // te[0][0] = 1;
            // te[0][1] = 0;
            for(int i = 1; i < n; i++) {
                if(ar[i] > ar[i - 1]) {
                    // if(te[i - 1][0] == 1) te[i] = te[i - 1];
                    // else {
                        te[i][0] = 1;
                        te[i][1] = te[i - 1][1] + 1;
                    // }
                } else if(ar[i] < ar[i - 1]) {
                    // if(te[i - 1][0] != 0) {
                    //     te[i] = te[i - 1];
                    // } else {
                        te[i][0] = -1;
                        te[i][1] = te[i - 1][1] + 1;
                    // }
                } else {
                    te[i][0] = te[i - 1][0];
                    te[i][1] = te[i - 1][1] + 1;
                }
            }
            for(int[] row : te) System.out.println(Arrays.toString(row));
            System.out.println(te[n - 1][1]);
        }
    }
}