class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(map.containsKey(s)){
                ans.get(map.get(s)).add(str);
            }
            else{
                map.put(s,ans.size());
                ans.add(new ArrayList<>());
                ans.get(ans.size()-1).add(str);
            }
        }
        return ans;
    }
}
