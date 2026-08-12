class Solution {
    public boolean isPerfectSquare(int num) {
        long lef = 1;
        long rig = num;
        while(lef <= rig){
           long mid = lef + (rig - lef) / 2;
            long sq = mid * mid;

            if (sq == num) {
                return true;
            } 
            else if (sq < num) {
                lef = mid + 1;
            } 
            else {
                rig = mid - 1;
            }
        }
        return false;
 
        
    }
}