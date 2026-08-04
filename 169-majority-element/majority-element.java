import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int maxc = 1;
        int count = 1;
        int el = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxc) {
                maxc = count;
                el = nums[i];
            }
        }

        return el;
    }
}