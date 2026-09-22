class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
        
        int[] diff = new int[52];
        
        
        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];
            diff[start] += 1;     
            diff[end + 1] -= 1;   
        }
        
        
        int currentCoverage = 0;
        for (int i = 1; i <= right; i++) {
            currentCoverage += diff[i];
            
            
            if (i >= left && currentCoverage == 0) {
                return false; 
            }
        }
        
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna