class Solution {
    public boolean checkDivisibility(int n) {
        int y = n;
        int s = 0;
        int pro = 1;

        while (n > 0) {
            int d = n % 10;

            s += d;
            pro *= d;

            n /= 10;
        }

        return y % (s + pro) == 0;
    }
}