import java.util.*;

public class B_Two_Binary_Strings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            String s1 = scn.next(), s2 = scn.next();
            List<Integer> idx0 = new ArrayList<>();
            Set<Integer> idx1 = new HashSet<>();
            int n = s1.length();
            for(int i = 0; i < n; i++) {
                if(s1.charAt(i) == '0' && s2.charAt(i) == '0') idx0.add(i);
                if(s1.charAt(i) == '1' && s2.charAt(i) == '1') idx1.add(i);
            }
            boolean ans = false;
            for(int idx : idx0) {
                if(idx1.contains(idx + 1)) {
                    ans = true;
                    break;
                }
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }
}