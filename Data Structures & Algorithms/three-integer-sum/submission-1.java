class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n-1 ; i ++ ){
            // int target = nums[i];
            // if(nums[i] == nums[i+1]) continue;
            for(int j = i+1 ; j < n-1 ; j++){
                // if(nums[j] == nums[j+1]) continue;
                // int rem = target - nums[j];
                int low = j+1;
                int high = n-1;
                int mid = 0;
                int rem = -(nums[i] + nums[j]);
                while(high>=low){
                    mid = (high+low)/2;
                    if(nums[mid] == rem){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[mid]);
                        ans.add(list);
                        System.out.println(i+" "+j+" "+mid);
                        high = -1;
                    }
                    else if(nums[mid]>rem){
                        high = mid-1;
                    }
                    else low = mid+1;
                }
            }
        }
        return new ArrayList<>(ans);
    }
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
