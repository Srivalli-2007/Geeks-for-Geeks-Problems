class Solution {
    public String replaceAll(String s, String s1, String s2) {

        int n = s.length();
        int m = s1.length();

        // Build LPS array
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (s1.charAt(i) == s1.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }

        StringBuilder ans = new StringBuilder();

        i = 0;
        int j = 0;
        int last = 0;

        while (i < n) {

            if (s.charAt(i) == s1.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {

                int start = i - m;

                // Add part before match
                ans.append(s, last, start);

                // Add replacement
                ans.append(s2);

                last = i;
                j = 0;

            } else if (i < n && s.charAt(i) != s1.charAt(j)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        // Add remaining part
        ans.append(s, last, n);

        return ans.toString();
    }
}