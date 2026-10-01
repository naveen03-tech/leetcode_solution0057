class Solution {
    public int maxProfit(int[] prices) {
        int b1 = Integer.MIN_VALUE;
        int s1 = 0;
        int b2 = Integer.MIN_VALUE;
        int s2 = 0;
        for(int pr : prices){
            b1 = Math.max(b1 , -pr);
            s1 = Math.max(s1, b1 + pr);
            b2 = Math.max(b2 ,s1 -pr);
            s2 = Math.max(s2 , b2 + pr);
        }
        return s2;
    }
}