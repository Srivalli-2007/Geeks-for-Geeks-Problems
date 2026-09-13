class Solution {
    public ArrayList<Integer> sentenceWord(String s) {
        ArrayList<Integer> result = new ArrayList<>();
        int sentences = 0;
        int words = 0;
        boolean inWord = false;
        boolean hasText = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || 
                (ch >= 'A' && ch <= 'Z')) {
                if (!inWord) {
                    words++;
                    inWord = true;
                }
                hasText = true;
            } 
            else {
                inWord = false;
                if (ch == '.' || ch == '!' || ch == '?') {
                    if (hasText) {
                        if (i == 0 || 
                            (s.charAt(i - 1) != '.' &&
                             s.charAt(i - 1) != '!' &&
                             s.charAt(i - 1) != '?')) {
                            sentences++;
                            hasText = false;
                        }
                    }
                }
            }
        }
        if (hasText) {
            sentences++;
        }
        result.add(sentences);
        result.add(words);
        return result;
    }
}