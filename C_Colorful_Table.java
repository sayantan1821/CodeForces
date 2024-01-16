//TEMPLATE V2
 
import java.io.*;
import java.util.*;
 
public class C_Colorful_Table {
    // Solution goes below: ------------------------------------
 
    public void solution() throws IOException {
        int t = nextInt();
        for (int test = 0; test < t; test++) {
            int n = nextInt();
            int k = nextInt();
            int[] a = new int[n];
            ArrayList<ArrayList<Integer>> occurences = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                occurences.add(new ArrayList<>());
            }
 
            for (int i = 0; i < n; i++) {
                a[i] = nextInt() - 1;
                occurences.get(a[i]).add(i);
            }
 
            boolean[] used = new boolean[n];
            int lptr = 0;
            int rptr = n - 1;
            int[] res = new int[k];
            for (int i = 0; i < k; i++) {
                if (occurences.get(i).size() == 0 || rptr - lptr + 1 < 0) {
                    res[i] = 0;
                    continue;
                }
                res[i] = 2 * (rptr - lptr + 1);
                for (int j : occurences.get(i)) {
                    used[j] = true;
                }
                while (lptr < n && used[lptr]) {
                    lptr++;
                }
                while (rptr >= 0 && used[rptr]) {
                    rptr--;
                }
            }
            for (int i = 0; i < k; i++) {
                print(res[i] + " ");
            }
            println();
        }
    }
 
    // Solution goes above: ------------------------------------
    public static final String IN_FILE = "";
    public static final String OUT_FILE = "";
    // -------------------- ------------------------------------
    // IO
    public static BufferedReader br;
    public static StringTokenizer st;
    public static BufferedWriter bw;
 
    public static void main(String[] args) throws IOException {
        if (IN_FILE == "") {
            br = new BufferedReader(new InputStreamReader(System.in));
        } else {
            try {
                br = new BufferedReader(new FileReader(IN_FILE));
            } catch (FileNotFoundException e) {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }
        if (OUT_FILE == "") {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        } else {
            try {
                bw = new BufferedWriter(new FileWriter(OUT_FILE));
            } catch (FileNotFoundException e) {
                bw = new BufferedWriter(new OutputStreamWriter(System.out));
            }
        }
        (new C_Colorful_Table()).solution();
        bw.close();// Flushes too.
    }
 
    public static String nextToken() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
 
    public static String nextLine() {
        st = null;
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
 
    public static int nextInt() {
        return Integer.parseInt(nextToken());
    }
 
    public static long nextLong() {
        return Long.parseLong(nextToken());
    }
 
    public static double nextDouble() {
        return Double.parseDouble(nextToken());
    }
 
    public static void println(Object s) throws IOException {
        bw.write(s.toString() + "\n");
    }
 
    public static void println() throws IOException {
        bw.newLine();
    }
 
    public static void print(Object s) throws IOException {
        bw.write(s.toString());
    }
 
    public static void flush() throws IOException {// Useful for debug
        bw.flush();
    }
}