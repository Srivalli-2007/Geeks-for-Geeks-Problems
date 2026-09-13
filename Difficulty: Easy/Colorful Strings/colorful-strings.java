class Solution {
    int countStrings(int n, int r, int b, int g) {
        int ans = 0;
        for (int R = r; R <= n; R++) {
            for (int B = b; B <= n - R; B++) {

                int G = n - R - B;

                if (G >= g) {
                    ans += combinations(n, R, B, G);
                }
            }
        }

        return ans;
    }

    int combinations(int n, int r, int b, int g) {

        long result = 1;

        // n! / (r! b! g!)
        for (int i = 1; i <= r; i++)
            result = result * (n - r + i) / i;

        int remaining = n - r;

        for (int i = 1; i <= b; i++)
            result = result * (remaining - b + i) / i;

        return (int) result;
    }
}