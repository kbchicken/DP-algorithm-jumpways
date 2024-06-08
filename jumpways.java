
public class jumpways {

    public static long findWays(int N) {
        
        if (N <= 0) {
            return 1;
        }

        long[] dp = new long[N + 1];

        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            dp[i] = 0;
            if (i >= 1) dp[i] += dp[i - 1];
            if (i >= 2) dp[i] += dp[i - 2];
            if (i >= 3) dp[i] += dp[i - 3];
            if (i >= 4) dp[i] += dp[i - 4];
            if (i >= 5) dp[i] += dp[i - 5];
        }

        return dp[N];
    }

    public static void main(String[] args) {
        int N = 1000;
        System.out.println("Number of ways to move " + N + " meters: " + findWays(N));
    }
}
