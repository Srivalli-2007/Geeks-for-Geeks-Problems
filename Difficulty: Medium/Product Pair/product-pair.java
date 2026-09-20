import java.util.*;
class Solution {
    public boolean isProduct(int[] arr, long target) {
        HashSet<Long> set = new HashSet<>();
        for (int x : arr) {
            long num = x;
            if (target == 0) 
            {
                if (num == 0 && !set.isEmpty())
                    return true;
            }
            else {
                if (num != 0 && target % num == 0) 
                {
                    long need = target / num;
                    if (set.contains(need))
                        return true;
                }
            }
            set.add(num);
        }
        return false;
    }
}