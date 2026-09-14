import java.util.Arrays;
class Solution {
    public String largestNumber(int[] nums) {
        String[] ne = new String[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ne[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ne, (a,b) -> (b + a).compareTo(a + b));
        if(ne[0].equals("0")){
            return "0";
        }  
        StringBuilder s = new StringBuilder();
        for(String r : ne){
            s.append(r);
        }
        return s.toString();
}
}