class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int[] locationDelta = new int[1001];
        
        
        for (int[] trip : trips) {
            int numPassengers = trip[0];
            int startLocation = trip[1];
            int endLocation = trip[2];
            
            locationDelta[startLocation] += numPassengers;
            locationDelta[endLocation] -= numPassengers;
        }
        
        
        int currentPassengers = 0;
        for (int passengerChange : locationDelta) {
            currentPassengers += passengerChange;
            
            
            if (currentPassengers > capacity) {
                return false;
            }
        }
        
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna