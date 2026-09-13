class Solution {
    public String smallestNumber(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < n; j++) {

                // Do not allow 0 at the first position
                if (i == 0 && a[j] == '0')
                    continue;

                if (a[j] <= a[pos] && a[j] < a[i])
                    pos = j;
            }

            // Swap if we found a smaller digit
            if (pos != i) {
                char temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;

                break;  // At most one swap
            }
        }

        return new String(a);
    }
}