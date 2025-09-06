import java.util.*;
public class LIS {
    public static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> tails = new ArrayList<>();
        for (int x : nums) {
            int i = Collections.binarySearch(tails, x);
            if (i < 0) i = -i - 1;
            if (i == tails.size()) tails.add(x); else tails.set(i, x);
        }
        return tails.size();
    }
    public static void main(String[] args) {
        int[] a = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(a));
    }
}
