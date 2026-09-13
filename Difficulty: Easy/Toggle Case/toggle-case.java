class Solution {
    public String toggleCase(String s) {
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c))
                ans.append(Character.toUpperCase(c));
            else
                ans.append(Character.toLowerCase(c));
        }

        return ans.toString();
    }
}