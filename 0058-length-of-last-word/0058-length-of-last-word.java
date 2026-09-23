class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            if (ch != ' ') {
                length++; 
            } else if (length > 0) {
                
                break;
            }
        }
        
        return length;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna