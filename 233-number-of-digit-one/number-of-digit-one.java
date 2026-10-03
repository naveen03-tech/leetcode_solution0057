class Solution {
    public int countDigitOne(int n) {
       long count = 0;
        for(long i = 1; i <= n ; i *= 10){
            long j = n / (i * 10);
          long curr = (n / i)% 10;
          long pr = n % i;
            if(curr == 0){
                count += j * i;
            }else if( curr == 1){
                count += j * i + pr + 1;
            }else{
                count += (j + 1) * i;
            }
        }
        return (int)count;
    }
}