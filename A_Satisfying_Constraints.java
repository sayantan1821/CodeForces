import java.util.*;

public class A_Satisfying_Constraints {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            long max = 1000000000, min = 1;
            Set<Long> set = new HashSet<>();
            for(int i = 0; i < n; i++) {
                int a = scn.nextInt();
                if(a == 1) {
                    min = Math.max(min, scn.nextLong());
                } else if (a == 2) {
                    max = Math.min(max, scn.nextLong());
                } else set.add(scn.nextLong());
            }
            long total = max - min + 1;
            for(long num : set) if(num >= min && num <= max) total--;
            System.out.println(Math.max(0, total));
        }
    }
}