class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = 0 ;
        int r = n - 1;
        for(int i = n - 1; i >= 0 ; i--){
            int lq = nums[l] * nums[l];
            int rq = nums[r] * nums[r];
             if (lq >= rq) {
                res[i] = lq;
                l++;
            } else {
                res[i] = rq;
                r--;
            }
        }
        return res;
    }
}