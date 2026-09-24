class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int minDiff=Integer.MAX_VALUE;
        ArrayList<Integer> res=new ArrayList<>();
        while(left<right){
            int sum=arr[left]+arr[right];
            int diff=Math.abs(sum-target);
            if(diff<minDiff){
                minDiff=diff;
                res.clear();
                res.add(arr[left]);
                res.add(arr[right]);
            }
            if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
            else{
                return res;
            }
        }
        return res;
    }
}