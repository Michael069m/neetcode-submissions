class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        for(int i = 0 ; i < n ; i++){
            int rem = target - nums[i];
            int low = i+1;
            int high = n-1;
            int mid = 0;
            while(high>=low){
                mid = (high+low)/2;
                if(nums[mid] == rem){
                    ans[0] = i+1;
                    ans[1] = mid+1;
                    return ans;
                }
                else if(nums[mid]>rem){
                    high = mid-1;
                }
                else low = mid+1;
            }
        }
        return ans;
    }
}
