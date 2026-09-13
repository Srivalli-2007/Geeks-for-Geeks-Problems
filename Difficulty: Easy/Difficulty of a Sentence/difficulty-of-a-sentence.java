class Solution {
    int calcDiff(String s) {
        String[] words = s.split(" ");
        int score = 0;
        for (String word : words) {
            int vowels = 0;
            int consonants = 0;
            int consecutive = 0;
            boolean hard = false;

            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                    consecutive = 0;
                } else {
                    consonants++;
                    consecutive++;

                    if (consecutive == 4) {
                        hard = true;
                    }
                }
            }

            if (consonants > vowels) {
                hard = true;
            }

            if (hard)
                score += 5;
            else
                score += 3;
        }

        return score;
    }
}