class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int p = n;
        String s2 = "";

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (i + 1 < p) {
                    s2 += " " + s.substring(i + 1, p);
                }
                p = i;
            }
        }

        if (p > 0) {
            s2 += " " + s.substring(0, p);
        }

        return s2.trim();
    }
}
