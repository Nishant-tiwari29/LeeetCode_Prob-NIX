import java.util.Arrays;

class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int n = nums.length;
        int[] freq = new int[n];
        
        
        for (int[] request : requests) {
            int start = request[0];
            int end = request[1];
            freq[start]++;
            if (end + 1 < n) {
                freq[end + 1]--;
            }
        }
        
        
        for (int i = 1; i < n; i++) {
            freq[i] += freq[i - 1];
        }
        
        Arrays.sort(nums);
        Arrays.sort(freq);
        
        
        long totalSum = 0;
        long MOD = 1_000_000_007;
        
        for (int i = 0; i < n; i++) {
            totalSum = (totalSum + (long) nums[i] * freq[i]) % MOD;
        }
        
        return (int) totalSum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna