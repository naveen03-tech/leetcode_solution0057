import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet <Character> se = new HashSet<>();
     int l = 0 ; 
     int maxl = 0 ; 
     for (int i = 0 ; i < s.length(); i++){
        while(se.contains(s.charAt(i))){
            se.remove(s.charAt(l));
            l++;   
        }
        se.add(s.charAt(i));
        maxl = Math.max(maxl , i - l +1);
     }   
     return maxl;
    }
}