class Solution {
    public String reducedString(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            ans.append(s.charAt(i));
            int n = ans.length();
            if (n >= 3 &&
                ans.charAt(n - 1) == ans.charAt(n - 2) &&
                ans.charAt(n - 2) == ans.charAt(n - 3)) {

                ans.delete(n - 3, n);
            }
        }
        if (ans.length() == 0)
            return "-1";
        return ans.toString();
    }
}