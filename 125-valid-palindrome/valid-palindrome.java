class Solution {
    public boolean isPalindrome(String s) {
       s= s.toLowerCase();
        s= s.replaceAll("[^a-z0-9]", "");
       
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();

        return s.equals(sb.toString());
    }
}