import java.util.*;
class Solution {
    public static boolean makePalindrome(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int odd = 0;
        for (String s : map.keySet()) {
            String rev = new StringBuilder(s).reverse().toString();
            if (s.equals(rev)) {
                // Palindromic string
                if (map.get(s) % 2 != 0) {
                    odd++;
                }
            } else {
                // String and its reverse must occur same number of times
                if (!map.containsKey(rev) || !map.get(s).equals(map.get(rev))) {
                    return false;
                }
            }
        }

        // At most one palindromic string can have odd frequency
        return odd <= 1;
    }
}