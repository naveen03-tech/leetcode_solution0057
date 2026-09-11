class Solution {
    public long countCommas(long n) {
        long i = 0;
        long k = 1000;
        while(k <= n){
            i += n - k + 1;
            k *= 1000;
        }
        return i;
    }
}