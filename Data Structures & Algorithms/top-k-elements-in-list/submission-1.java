class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.a - a.a);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int val = entry.getValue();
            pq.add(new Pair(val,num));
        }
        int[] ans = new int[k];
        for(int i = 0 ; i < k ; i++){
            ans[i] = pq.poll().b;
        }
        return ans;
    }
}
class Pair{
    int a , b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}