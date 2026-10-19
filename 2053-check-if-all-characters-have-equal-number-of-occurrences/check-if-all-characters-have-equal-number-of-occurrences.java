class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] frq = new int[26];
        for(char c : s.toCharArray()){
            frq[c -'a']++;
        }
        int count = 0;
        
        for(int i : frq){
            if(i > 0){
                if(count == 0){
                    count = i;
                }else if (count  != i){
                    return false;
                }
                }
            }
            return true;
        }
    }
