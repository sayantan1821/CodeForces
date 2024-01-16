import java.util.*;

public class B_Arranging_Cats {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            String s = scn.next();
            String f = scn.next();
            Stack<Integer> st = new Stack<>();
            int count = 0;
            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == f.charAt(i)) continue;
                else if(s.charAt(i) == '0') {
                    if(!st.isEmpty() && st.peek() == 1) st.pop();
                    else {st.push(0); count++;}
                } else {
                    if(!st.isEmpty() && st.peek() == 0) st.pop();
                    else {st.push(1); count++;}
                }
            }
            System.out.println(count);
        }
    }
}    