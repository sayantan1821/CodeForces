import java.util.*;

public class A_Prime_Deletion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            String num = scn.next();
            int[] ar = new int[]{13, 29, 31, 47, 53, 61, 71, 83, 97};
            System.out.println(ar[num.charAt(0) - '0' - 1]);
        }
    }
}