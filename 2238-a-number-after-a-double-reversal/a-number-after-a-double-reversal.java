class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num < 0 ){
            return false;
        }
        StringBuilder sb  = new StringBuilder();
        sb.append(num);
        sb.reverse();
        long res = Long.parseLong(sb.toString());
        StringBuilder sb1  = new StringBuilder();
        sb1.append(res);
        sb1.reverse();
        long res1 = Long.parseLong(sb1.toString());
        if(num == res1){
            return true;
        }else{
            return false;
        }

    }
}