import java.util.*;
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
		int left=0;
		int right=n-1;
		while(left<right)
		{
		       int s=arr[left]+arr[right];
		       if(s==target)
		       {
		          return true;
		       }
		       else if(s<target)
		       {
		          left++;
		        }
		       else{
		           right--;
		        }
		  }
		     return false;
    }
}