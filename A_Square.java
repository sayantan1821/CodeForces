import java.util.*;

public class A_Square {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int[][] coord = new int[4][2];
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 2; j++) coord[i][j] = scn.nextInt();
            }
            Arrays.sort(coord, (a, b) -> Double.compare(a[0], b[0]));
            System.out.println(Math.abs(coord[0][1] - coord[1][1]) * Math.abs(coord[1][0] - coord[2][0]));
        }
    }
}    