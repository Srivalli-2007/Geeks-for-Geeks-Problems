class Solution {
    public static String encode(String s) {
        // code here
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(s.charAt(i)).append(count);
        }
        return result.toString();
    }
}