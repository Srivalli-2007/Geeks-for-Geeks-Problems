import java.util.*;

class Solution {
    public String reverse(String S) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.toString();
    }
}