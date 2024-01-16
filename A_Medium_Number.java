import java.util.*;

public class A_Medium_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int[] ar = new int[3];
            for(int i = 0; i < 3; i++) ar[i] = scn.nextInt();
            for(int i = 0; i < 3; i++) {
                for(int j = i + 1; j < 3; j++) {
                    if(ar[i] > ar[j]) {
                        int temp = ar[i];
                        ar[i] = ar[j];
                        ar[j] = temp;
                    }
                }
            }
            // Arrays.sort(ar);
            System.out.println(ar[1]);
        }
    }
}