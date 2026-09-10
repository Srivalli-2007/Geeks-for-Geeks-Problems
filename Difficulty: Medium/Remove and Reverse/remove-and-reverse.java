class Solution {
    String removeReverse(String S) {

        int n = S.length();

        // Frequency of each character
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[S.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = n - 1;

        // 0 -> move from left
        // 1 -> move from right
        int direction = 0;

        char[] arr = S.toCharArray();

        while (left <= right) {

            if (direction == 0) {

                char ch = arr[left];

                if (freq[ch - 'a'] == 1) {
                    left++;
                } 
                else {
                    freq[ch - 'a']--;
                    arr[left] = '#';

                    left++;

                    // Reverse direction
                    direction = 1;
                }

            } 
            else {

                char ch = arr[right];

                if (freq[ch - 'a'] == 1) {
                    right--;
                } 
                else {
                    freq[ch - 'a']--;
                    arr[right] = '#';

                    right--;

                    // Reverse direction
                    direction = 0;
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        // If direction is 0, read normally
        if (direction == 0) {

            for (int i = 0; i < n; i++) {
                if (arr[i] != '#') {
                    ans.append(arr[i]);
                }
            }

        } 
        // If direction is 1, read in reverse
        else {

            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] != '#') {
                    ans.append(arr[i]);
                }
            }
        }

        return ans.toString();
    }
}