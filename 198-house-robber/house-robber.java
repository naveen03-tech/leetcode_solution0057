class Solution {
    public int rob(int[] nums) {
        int p1 = 0;
        int p2 = 0 ; 
        for (int i = 0 ; i < nums.length ; i++){
     int c =  Math.max(p1 , p2 + nums[i]);
        p2 = p1;
        p1 = c ;
        }
        return p1;
    }
}