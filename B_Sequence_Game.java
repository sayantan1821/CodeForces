import java.util.*;

class B_Sequence_Game {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int m = scn.nextInt();
            int[] ar = new int[m];
            for(int i = 0; i < m; i++) ar[i] = scn.nextInt();
            List<Integer> ans = new ArrayList<>();
            ans.add(ar[0]);
            for(int i = 1; i < m; i++) {
                if(ar[i] < ar[i - 1]) ans.add(ar[i]);
                ans.add(ar[i]);
            }
            // System.out.println(ans);
            System.out.println(ans.size());
            for(int num : ans) System.out.print(num + " ");
            System.out.println();
        }
    }
}