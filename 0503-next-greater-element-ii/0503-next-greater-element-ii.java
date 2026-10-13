import java.util.ArrayDeque;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            while (!stack.isEmpty() && nums[stack.peek()] <= nums[idx]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[idx] = nums[stack.peek()];
            }

            stack.push(idx);
        }
        
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna