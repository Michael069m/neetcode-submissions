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

        int ind = 0;
        for(int i = 1; i < intervals.size() ; i++){
            int start1 = intervals.get(ind).start;
            int end1 = intervals.get(ind).end;
            int start2 = intervals.get(i).start;
            int end2 = intervals.get(i).end;
            if(end1<=start2){
                ind++;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
