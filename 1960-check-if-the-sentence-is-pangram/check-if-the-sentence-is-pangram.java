class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] s = new int[26];
        int count = 0;
        for(char c : sentence.toCharArray()){
            int index = c -'a';

            if(index >= 0 && index < 26 && s[index] == 0){
                s[index] = 1;
                count ++;
                if (count == 26){
                    return true;
                }
            }
        }

        return false;
    }
}