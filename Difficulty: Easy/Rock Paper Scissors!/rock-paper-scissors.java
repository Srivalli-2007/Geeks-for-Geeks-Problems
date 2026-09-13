class Solution {
    public int[] solveRPS(String a, String b, int k) {
        int n = a.length();
        int m = b.length();
        int gcd = n;
        int temp = m;
        while (temp != 0) {
            int r = gcd % temp;
            gcd = temp;
            temp = r;
        }

        int lcm = (n / gcd) * m;

        int winA = 0;
        int winB = 0;

        // Find wins in one complete cycle
        for (int i = 0; i < lcm; i++) {

            char x = a.charAt(i % n);
            char y = b.charAt(i % m);

            if (x == y)
                continue;

            if ((x == 'R' && y == 'S') ||
                (x == 'S' && y == 'P') ||
                (x == 'P' && y == 'R')) {
                winA++;
            } else {
                winB++;
            }
        }

        // Number of complete cycles
        int cycles = k / lcm;
        int remaining = k % lcm;

        int totalA = winA * cycles;
        int totalB = winB * cycles;

        // Remaining games
        for (int i = 0; i < remaining; i++) {

            char x = a.charAt(i % n);
            char y = b.charAt(i % m);

            if (x == y)
                continue;

            if ((x == 'R' && y == 'S') ||
                (x == 'S' && y == 'P') ||
                (x == 'P' && y == 'R')) {
                totalA++;
            } else {
                totalB++;
            }
        }

        return new int[]{totalA, totalB};
    }
}