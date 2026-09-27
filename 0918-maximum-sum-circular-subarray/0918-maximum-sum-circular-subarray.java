class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        
        int currMax = 0;
        int maxSubarraySum = nums[0];
        
        int currMin = 0;
        int minSubarraySum = nums[0];
        
        for (int num : nums) {
            currMax = Math.max(num, currMax + num);
            maxSubarraySum = Math.max(maxSubarraySum, currMax);
            
            currMin = Math.min(num, currMin + num);
            minSubarraySum = Math.min(minSubarraySum, currMin);
            
            totalSum += num;
        }
        if (maxSubarraySum < 0) {
            return maxSubarraySum;
        }
        
        return Math.max(maxSubarraySum, totalSum - minSubarraySum);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna