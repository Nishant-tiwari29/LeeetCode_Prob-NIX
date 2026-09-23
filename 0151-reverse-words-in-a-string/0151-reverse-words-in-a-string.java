class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;   
        
        while (i >= 0) {

            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }
            
            int end = i + 1;
            
            
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            
            
            if (sb.length() > 0) {
                sb.append(" ");
            }
            
            
            sb.append(s.substring(i + 1, end));
        }
        
        return sb.toString();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna