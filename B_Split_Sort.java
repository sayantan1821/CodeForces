import java.util.*;

public class B_Split_Sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] ar = new int[n + 1];
            for(int i = 1; i < n + 1; i++) {
                ar[scn.nextInt()] = i;
            }
            int op = 0;
            for(int i = 1; i < n; i++) if(ar[i + 1] < ar[i]) op++;
            System.out.println(op); 
        }
    }
}