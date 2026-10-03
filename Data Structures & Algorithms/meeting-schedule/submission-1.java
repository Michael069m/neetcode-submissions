/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size() == 0 )return true;
        Collections.sort(intervals,(a,b)-> a.start-b.start);
        List<Interval> ans = new ArrayList<>();
        ans.add(intervals.get(0));
        int ind = 0;
        for(int i = 1; i < intervals.size() ; i++){
            int start1 = intervals.get(ind).start;
            int end1 = intervals.get(ind).end;
            int start2 = intervals.get(i).start;
            int end2 = intervals.get(i).end;
            if(end1<=start2){
                ans.add(new Interval(start2,end2));
                ind++;
            }
            else{
                intervals.get(ind).end = Math.max(end1,end2);
                return false;
            }
        }
        return true;
        
    }
}
