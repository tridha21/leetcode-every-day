class Solution {
    public int countCommas(int n) {
        int i, cc = 0;

        if (n < 1000)
            return 0;

        for (i = 1000; i <= n; i++) {
            if (i >= 1000)
                cc++;

            if (i >= 1000000)
                cc++;

            if (i >= 1000000000)
                cc++;
        }

        return cc;
    }
}