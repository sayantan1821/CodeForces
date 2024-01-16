import java.util.*;

public class A_Wallet_Exchange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            if((a + b) % 2 == 0) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}