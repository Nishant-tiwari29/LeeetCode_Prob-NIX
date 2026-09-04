class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int l = 0;
        int r = nums.length - 1;

        for(int i = n-1 ; i >= 0 ; i--){
            int val;

            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                       val = nums[l];
                       l++;
            }else{
                val = nums[r];
                r--;
            }
            result[i]= val * val;
        }
        return result;
    }
}