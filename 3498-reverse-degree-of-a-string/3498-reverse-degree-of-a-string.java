class Solution {
    public int reverseDegree(String s) {
        int n, i, sum = 0, p;
        char ch;
        n = s.length();

        for (i = 0; i < n; i++) {
            ch = s.charAt(i);
            p = 'z' - ch + 1;
            sum += p * (i + 1);
        }
        return sum;
    }
}