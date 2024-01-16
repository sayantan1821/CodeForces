import java.util.*;

public class A_Love_Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i < n; i++) ar[i] = scn.nextInt();
            for(int i = 0; i < n; i++) if(ar[ar[ar[i] - 1] - 1] - 1 == i) {System.out.println("YES"); return;}
            System.out.println("NO");
    }
}