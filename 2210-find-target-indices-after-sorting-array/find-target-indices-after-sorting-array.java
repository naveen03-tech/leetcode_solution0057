import java.util. ArrayList;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> k = new ArrayList<>();
        int s = 0 , equal = 0;
        for(int j : nums){
            if(j< target){
                s++;
            }else if(j == target){
                equal++;
            }
        }
            for(int i = 0; i < equal ; i++){
                k.add( s + i);
            }
            return k;
            }
        } 
    
