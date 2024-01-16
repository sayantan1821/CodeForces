import java.util.*;

public class B_Plus_Minus_Split {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            String s = scn.next();
            int count = 0;
            for(char ch : s.toCharArray()) {
                if(ch == '+') count++;
                else count--;
            }
            System.out.println(Math.abs(count));
        }
    }
}