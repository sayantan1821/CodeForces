import java.util.*;

class A_Gift_Carpet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            String[] carpet = new String[n];
            for(int i = 0; i < n; i++) {
                carpet[i] = scn.next();
            }
            String word = "vika";
            int j = 0,k = 0;
            while(j < m && k < 4) {
                for(int i = 0; i < n; i++) {
                    if(carpet[i].charAt(j) == word.charAt(k)) {
                        k++;
                        break;
                    }
                }
                j++;
            } 
            if(k == 4) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}