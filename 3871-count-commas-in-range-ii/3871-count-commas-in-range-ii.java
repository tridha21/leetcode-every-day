class Solution {
    public long countCommas(long n) {
        long start,end,commas,ans = 0;
        int digits;

        for (start = 1; start <= n; start *= 10) {
            end = Math.min(n, start * 10 - 1);

            digits = String.valueOf(start).length();
            commas = (digits - 1) / 3;

            ans += (end - start + 1) * commas;

            if (start > n / 10) break;
        }

        return ans;
    }
}