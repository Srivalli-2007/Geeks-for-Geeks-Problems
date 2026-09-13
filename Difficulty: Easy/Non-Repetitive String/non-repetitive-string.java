class Solution {
    public boolean nonRepetitive(String s) {
        // code here
        boolean[] seen = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (i > 0 && curr != s.charAt(i - 1)) {
                if (seen[curr - 'A']) {
                    return false;
                }
            }
            seen[curr - 'A'] = true;
        }
        return true;
    }
}

    