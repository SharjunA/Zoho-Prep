public class Kadane {
    public static int maxSubArray(int[] a) {
        int maxSoFar = a[0], cur = a[0];
        for (int i=1;i<a.length;i++) { cur = Math.max(a[i], cur + a[i]); maxSoFar = Math.max(maxSoFar, cur); }
        return maxSoFar;
    }
    public static void main(String[] args) { System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); }
}
