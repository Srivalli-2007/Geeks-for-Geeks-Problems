class Solution {
    public String removeChars(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (s2.indexOf(ch) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}