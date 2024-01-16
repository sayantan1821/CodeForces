import java.util.*;

public class A_Make_It_Zero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] ar = new int[n];
            int xor = 0;
            for(int i = 0; i < n; i++) ar[i] = scn.nextInt();
            if(n % 2 == 0) {
                System.out.println(2);
                System.out.println(1 + " " + n);
                System.out.println(1 + " " + n);
                continue;
            } else {
                if(ar[0] == 0) {
                    System.out.println(2);
                    System.out.println(2 + " " + n);
                    System.out.println(2 + " " + n);
                } else if(ar[n - 1] == 0) {
                    System.out.println(2);
                    System.out.println(1 + " " + (n - 1));
                    System.out.println(1 + " " + (n - 1));
                } else {
                    int zeroIdx = 1;
                    for(int i = 1; i < n; i++) if(ar[i] == 0) {
                        zeroIdx = i;
                        break;
                    }
                    System.out.println(4);
                    System.out.println(1 + " " + (zeroIdx - 1));
                    System.out.println(1 + " " + (zeroIdx - 1));

                    System.out.println((zeroIdx + 1) + " " + n);
                    System.out.println((zeroIdx + 1) + " " + n);
                }
            }
        }
    }
}