class Solution {
    public char decodeIt(String s, long k) {

        int n = s.length();
        long[] len = new long[n];

        long current = 0;

        // Find length of decoded string
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                current++;
            } else {
                int d = c - '0';

                if (current > k / d)
                    current = k;
                else
                    current *= d;
            }

            len[i] = current;
        }

        // Work backwards to find kth character
        for (int i = n - 1; i >= 0; i--) {

            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {

                if (k == len[i])
                    return c;

                // Remove this character
                if (i > 0)
                    len[i - 1] = len[i] - 1;

            } else {

                int d = c - '0';

                long previousLength = len[i - 1];

                k = (k - 1) % previousLength + 1;
            }
        }

        return ' ';
    }
}