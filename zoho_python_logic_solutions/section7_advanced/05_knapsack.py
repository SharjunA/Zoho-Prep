def knapSack(W, wt, val):
    n = len(wt)
    dp = [[0]*(W+1) for _ in range(n+1)]
    for i in range(1,n+1):
        for w in range(W+1):
            dp[i][w] = dp[i-1][w] if wt[i-1] > w else max(dp[i-1][w], val[i-1] + dp[i-1][w-wt[i-1]])
    return dp[n][W]
print(knapSack(50, [10,20,30], [60,100,120]))
