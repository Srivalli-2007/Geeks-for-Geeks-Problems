class Solution {
    public String boomNumber(int k) {

        // Find the length of the answer
        int len = 1;
        long count = 2;

        while (k > count) {
            len++;
            count += (1L << len);
        }

        // Starting position of this length
        long start = count - (1L << len) + 1;

        // Position inside this length (0-based)
        long pos = k - start;

        StringBuilder ans = new StringBuilder();

        // Convert position to binary
        for (int i = len - 1; i >= 0; i--) {
            if ((pos & (1L << i)) == 0)
                ans.append('2');
            else
                ans.append('3');
        }

        return ans.toString();
    }
}