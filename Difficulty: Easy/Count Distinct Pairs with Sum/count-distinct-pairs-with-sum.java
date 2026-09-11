class Solution {
    static int countDistinctPairs(int arr[], int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                count++;

                int leftValue = arr[left];
                int rightValue = arr[right];

                while (left < right && arr[left] == leftValue) {
                    left++;
                }

                while (left < right && arr[right] == rightValue) {
                    right--;
                }
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return count;
    }
}