class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int ans = 0;
        int area = 0;
        while(l<r){
            area = (r-l) * (Math.min(heights[l],heights[r]));
            ans = Math.max(area,ans);
            if(heights[l]>heights[r]){
                r--;
            }
            else l++;
        }
        return ans;
    }
}
