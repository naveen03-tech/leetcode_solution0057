class Solution {
    public int reverse(int x) {
     boolean negative;
     if (x < 0){
        negative = true;
         }else{
            negative = false;
         }
         StringBuilder sb = new StringBuilder();
        sb.append(Math.abs((long)x));
         sb.reverse();
       long res = Long.parseLong(sb.toString());
         if(negative){
           res = -res;
         }
         if(res>Integer.MAX_VALUE ||res<Integer.MIN_VALUE){
            return 0;
         }

 return (int) res;

    }
}