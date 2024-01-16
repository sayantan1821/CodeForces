import java.util.*;

public class A_green_gold_dog_array_and_permutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] ar = new int[n];
            Map<Integer, Queue<Integer>> map = new TreeMap<>();
            for(int i = 0; i < n; i++) {
                ar[i] = scn.nextInt();
                if(map.containsKey(ar[i])) {
                    map.get(ar[i]).add(i);
                } else {
                    map.put(ar[i], new LinkedList<>());
                    map.get(ar[i]).add(i);
                }
            }
            int[] ans = new int[n];
            for(int key : map.keySet()) {
                while(!map.get(key).isEmpty()) ans[map.get(key).remove()] = n--; 
            }
            for(int num : ans) System.out.print(num + " ");
            System.out.println();
        }
    }
}