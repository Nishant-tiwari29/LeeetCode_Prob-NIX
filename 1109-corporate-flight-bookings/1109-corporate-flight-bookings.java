class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int[] answer = new int[n];
        
        
        for (int[] booking : bookings) {
            int first = booking[0] - 1; 
            int last = booking[1];      
            int seats = booking[2];
            
            
            answer[first] += seats;
            
            
            if (last < n) {
                answer[last] -= seats;
            }
        }
        
       
        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1];
        }
        
        return answer;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna