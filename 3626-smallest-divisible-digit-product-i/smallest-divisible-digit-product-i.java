class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int pr =1;
            int tem = n;
        
         while (tem > 0) {
                pr *= tem % 10;
                tem /= 10;
            }
        
       if (pr % t == 0) {
            return n;
        }
        n++;
    }
}
}