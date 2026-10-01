class Solution {
    public boolean isNumber(String s) {
        boolean digitSeen = false;
        boolean dotSeen = false;
        boolean exponentSeen = false;
        boolean digitAfterExponent = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                digitSeen = true;

                if (exponentSeen) {
                    digitAfterExponent = true;
                }

            } else if (c == '+' || c == '-') {
                // Sign is valid only at the beginning
                // or immediately after e/E
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }

            } else if (c == '.') {
                // Decimal point cannot appear after exponent
                // and can occur only once
                if (dotSeen || exponentSeen) {
                    return false;
                }

                dotSeen = true;

            } else if (c == 'e' || c == 'E') {
                // Exponent must appear only once
                // and must come after at least one digit
                if (exponentSeen || !digitSeen) {
                    return false;
                }

                exponentSeen = true;
                digitAfterExponent = false;

            } else {
                return false;
            }
        }

        return digitSeen && digitAfterExponent;
    }
}