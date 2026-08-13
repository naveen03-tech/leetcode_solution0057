class Solution {
    public void sortColors(int[] nums) {
        for(int n = 0; n < nums.length-1 ;n++){
            for(int j = 0;  j < nums.length -1 - n; j++){
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // return nums;
    }
}