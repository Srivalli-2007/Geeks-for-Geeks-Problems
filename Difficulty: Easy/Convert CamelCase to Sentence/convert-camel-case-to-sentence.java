class Solution {
    public String amendSentence(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i > 0 && Character.isUpperCase(ch)) {
                result.append(' ');
            }
            result.append(Character.toLowerCase(ch));
        }
        return result.toString();
    }
}