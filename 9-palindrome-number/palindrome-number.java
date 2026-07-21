class Solution {
    public boolean isPalindrome(int x) {
            if (x < 0) {
            return false;
        }
 StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.reverse();

        long res = Long.parseLong(sb.toString());
        if(x == res){
            return true;
        }else{
            return false;
        }
    }
}