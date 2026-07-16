class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        list.add(intervals[0]);
        for(int i =1 ; i < intervals.length ; i++){
            int ind = list.size();
            int start1 = list.get(ind-1)[0];
            int end1 = list.get(ind-1)[1];
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if(start1 <= start2 && start2<=end1){
                list.get(ind-1)[1] = Math.max(end2,end1);
            }
            else{
                list.add(intervals[i]);
            }
        }
        int[][] ans = new int[list.size()][2];
        int i = 0;
        for(int[] arr : list){
            ans[i][0] = arr[0];
            ans[i][1] = arr[1];
            i++;
        }
        return ans;
    }
}
