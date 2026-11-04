class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        int maxs = sum;
        for(int i = k ; i < nums.length; i++){
            sum = sum - nums[i -k] + nums[i];
            maxs = Math.max(maxs, sum);
        }
        return (double) maxs/k; 
   }
}