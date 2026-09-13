class Solution {
    public static boolean checkPangram(String s) {
        s = s.toLowerCase();
        boolean[] present = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (present[i] == false) {
                return false;
            }
        }
        return true;
    }
}