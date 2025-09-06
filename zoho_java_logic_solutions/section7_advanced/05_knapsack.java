public class Knapsack {
    public static int knapSack(int W, int[] wt, int[] val) {
        int n = wt.length;
        int[][] dp = new int[n+1][W+1];
        for (int i=1;i<=n;i++) for (int w=0; w<=W; w++)
            dp[i][w] = (wt[i-1] <= w) ? Math.max(dp[i-1][w], val[i-1] + dp[i-1][w-wt[i-1]]) : dp[i-1][w];
        return dp[n][W];
    }
    public static void main(String[] args) {
        System.out.println(knapSack(50, new int[]{10,20,30}, new int[]{60,100,120}));
    }
}
