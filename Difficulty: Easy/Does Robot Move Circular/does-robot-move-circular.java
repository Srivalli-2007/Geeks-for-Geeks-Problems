class Solution {
    public boolean isCircular(String s) {
        int x = 0, y = 0;
        int dir = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'G') {
                if (dir == 0) y++;
                else if (dir == 1) x++;
                else if (dir == 2) y--;
                else x--;
            }
            else if (ch == 'L') {
                dir = (dir + 3) % 4;
            }
            else if (ch == 'R') {
                dir = (dir + 1) % 4;
            }
        }

        return x == 0 && y == 0;
    }
}