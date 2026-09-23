class Solution {
    public int maxSubArray(int[] nums) {
        int maxFar = nums[0];
        int currentMax = nums[0];       
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxFar = Math.max(maxFar, currentMax);
        }
        
        return maxFar;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna