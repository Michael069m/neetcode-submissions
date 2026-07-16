class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans = 0;
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums){
            if(set2.contains(num)) continue;
            int len = 1;
            int left = num - 1;
            int right = num + 1;
            while(set.contains(left)){
                len++;
                left--;
            }
            while(set.contains(right)){
                len++;
                right++;
            }
            ans = Math.max(ans,len);
        }
        return ans;
    }
}
