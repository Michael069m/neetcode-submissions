class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int num : nums){
            sum+=num;
            max = Math.max(max,num);
            ans = Math.max(sum,ans);
            if(sum<0) sum = 0;
        }
        return ans==0 ? max : ans;
    }
}
