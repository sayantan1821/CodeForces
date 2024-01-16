import java.util.*;

public class B_Swap_and_Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            String s = scn.next();
            char[] str = s.toCharArray();

            if (k % 2 == 0) {
                Arrays.sort(str);
                for (char ch : str)
                    System.out.print(ch);
                System.out.println();
            } else {
                List<Character> even = new ArrayList<>();
                List<Character> odd = new ArrayList<>();
                for (int i = 0; i < str.length; i++) {
                    if (i % 2 == 0)
                        even.add(str[i]);
                    else
                        odd.add(str[i]);
                }
                Collections.sort(even);
                Collections.sort(odd);
                int i = 0, j = 0;
                while(i < even.size()) {
                    System.out.print(even.get(i++));
                    if(j < odd.size()) System.out.print(odd.get(j++));
                }
                System.out.println();
            }
        }
    }
}