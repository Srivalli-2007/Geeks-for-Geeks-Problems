class Solution {
    public int modified(String s) {
        int count = 0;
        int same = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                same++;
            } else {
                same = 1;
            }
            if (same == 3) {
                count++;
                same = 1;
            }
        }
        return count;
    }
}