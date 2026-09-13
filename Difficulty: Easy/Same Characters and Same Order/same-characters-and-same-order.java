class Solution {
    public boolean sameSeq(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);

            if (c1 != c2) {
                return false;
            }

            // Skip all repeated characters in s1
            while (i < s1.length() && s1.charAt(i) == c1) {
                i++;
            }

            // Skip all repeated characters in s2
            while (j < s2.length() && s2.charAt(j) == c2) {
                j++;
            }
        }

        return i == s1.length() && j == s2.length();
    }
}