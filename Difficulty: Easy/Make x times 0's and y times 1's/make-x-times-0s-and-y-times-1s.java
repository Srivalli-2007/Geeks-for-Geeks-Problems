class Solution {
    public String arrangeString(String s, int x, int y) {
        int zero = 0;
        int one = 0;

        // Count 0s and 1s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                zero++;
            else
                one++;
        }

        StringBuilder ans = new StringBuilder(s.length());

        while (zero > 0 || one > 0) {

            // Add up to x zeros
            for (int i = 0; i < x && zero > 0; i++) {
                ans.append('0');
                zero--;
            }

            // Add up to y ones
            for (int i = 0; i < y && one > 0; i++) {
                ans.append('1');
                one--;
            }
        }

        return ans.toString();
    }
}