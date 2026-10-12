class Solution {
    public int divide(int dividend, int divisor) {
      if(dividend == Integer.MIN_VALUE && divisor == -1){
        return Integer.MAX_VALUE;
      }
      long ans = 0;
      long a = Math.abs((long) dividend);
      long b = Math.abs((long) divisor);
      int sign = 1;
      if((dividend <0 && divisor > 0 )|| (dividend > 0 && divisor <0)){
        sign = -1;
      }
      while(a >= b){
        long temp = b;
        long m = 1;
        while(a >= (temp << 1)){
            temp <<= 1;
            m <<= 1;
        }
        a -= temp;
        ans += m;
      }
     if (sign == -1){
        ans = -ans ;
     }
        return (int) ans;
    }
}