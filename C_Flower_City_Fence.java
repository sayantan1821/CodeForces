import java.util.*;

class C_Flower_City_Fence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int m = scn.nextInt();
            long[] ar = new long[m];
            for (int i = 0; i < m; i++)
                ar[i] = scn.nextInt();
            long max = 0;
            for (long plank : ar)
                max = Math.max(max, plank);
            List<Long> vert = new ArrayList<>();
            for (long plank : ar)
                vert.add(plank);
            List<Long> hori = new ArrayList<>();
            while (max-- > 0) {
                long total = 0;
                for (int i = 0; i < m; i++) {
                    if (ar[i] > 0) {
                        total++;
                        ar[i]--;
                    }
                }
                hori.add(total);
            }
            System.out.println(vert);
            if (hori.size() > vert.size())
                System.out.println("NO");
            else {
                boolean isSame = true;
                for (int i = 0; i < m; i++) {
                    if (vert.get(i) != hori.get(i)) {
                        isSame = false;
                        break;
                    }
                }
                System.out.println(isSame ? "YES" : "NO");
            }
        }
    }
}