class Solution {
    public boolean isHappy(int n) {

        int s,d;

        while (n != 1 && n != 4) {
            s = 0;

            while (n > 0) {
                d = n % 10;
                s += d * d;
                n /= 10;
            }

            n = s;
        }

        return n == 1;
    }
}
