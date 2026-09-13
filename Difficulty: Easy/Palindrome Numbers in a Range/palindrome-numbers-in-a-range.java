class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            String s = String.valueOf(i);
            String rev = new StringBuilder(s).reverse().toString();
            if (s.equals(rev)) {
                ans.add(i);
            }
        }

        return ans;
    }
}