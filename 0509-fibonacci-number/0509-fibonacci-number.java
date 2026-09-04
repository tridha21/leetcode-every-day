class Solution {
    public int fib(int n) {
        int a, b, c, i;

        if (n == 0)
            return 0;

        a = 0;
        b = 1;

        for (i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}