class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int MOD = 1_000_000_007;
        long totalSum = 0;
        
        for (int num : arr) {
            totalSum += num;
        }

        // Case 1: k = 1
        if (k == 1) {
            return (int) (kadane(arr, 1) % MOD);
        }

        // Case 2 & 3: k >= 2
        long maxTwoCopies = kadane(arr, 2);

        if (totalSum > 0) {
            long result = maxTwoCopies + (k - 2) * totalSum;
            return (int) (result % MOD);
        } else {
            return (int) (maxTwoCopies % MOD);
        }
    }

    private long kadane(int[] arr, int repeat) {
        long maxSoFar = 0;
        long currentMax = 0;

        for (int r = 0; r < repeat; r++) {
            for (int num : arr) {
                currentMax = Math.max((long) num, currentMax + num);
                maxSoFar = Math.max(maxSoFar, currentMax);
            }
        }

        return maxSoFar;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna